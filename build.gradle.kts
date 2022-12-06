import io.gitlab.arturbosch.detekt.Detekt
import kotlinx.kover.api.KoverProjectConfig
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.22"

    id("io.gitlab.arturbosch.detekt") version "1.22.0"
    id("org.jmailen.kotlinter") version "3.12.0"
    id("org.jetbrains.kotlinx.kover") version "0.6.1"
}

allprojects {
    apply(plugin = "kotlin")
    apply(plugin = "kover")

    group = "de.thermondo"
    version = "0.1.0"

    extensions.configure<KoverProjectConfig> {
        isDisabled.set(false)
        engine.set(kotlinx.kover.api.IntellijEngine("1.0.683"))
    }

    koverMerged {
        filters {
            projects {
                excludes += listOf(
                    "test-utils",
                    "advent-of-code", // TODO: Remove exclusion rules in order to track your progress
                    "basics", // TODO: Remove exclusion rules in order to track your progress
                )
            }
        }
        xmlReport {
            onCheck.set(false)
            reportFile.set(layout.buildDirectory.file("$buildDir/reports/kover/result.xml"))
        }
        htmlReport {
            onCheck.set(false)
            reportDir.set(layout.buildDirectory.dir("$buildDir/reports/kover/html-result"))
        }
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    tasks.test {
        useJUnitPlatform()
    }
}

repositories {
    mavenCentral()
}

tasks.withType<Detekt>().configureEach {
    jvmTarget = "17"
    reports {
        html.required.set(true)
        xml.required.set(false)
        txt.required.set(false)
        sarif.required.set(false)
    }
}

koverMerged {
    enable()
}
