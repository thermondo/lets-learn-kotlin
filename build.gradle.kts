import io.gitlab.arturbosch.detekt.Detekt
import kotlinx.kover.api.KoverProjectConfig
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application

    kotlin("jvm") version "1.7.20"

    id("io.gitlab.arturbosch.detekt") version "1.21.0"
    id("org.jmailen.kotlinter") version "3.12.0"
    id("org.jetbrains.kotlinx.kover") version "0.6.1"
}

allprojects {
    apply(plugin = "kover")

    group = "de.thermondo"
    version = "0.1.0"

    extensions.configure<KoverProjectConfig> {
        isDisabled.set(false)
        engine.set(kotlinx.kover.api.IntellijEngine("1.0.683"))
    }

    koverMerged {
        xmlReport {
            onCheck.set(false)
            reportFile.set(layout.buildDirectory.file("$buildDir/reports/kover/result.xml"))
        }
        htmlReport {
            onCheck.set(false)
            reportDir.set(layout.buildDirectory.dir("$buildDir/reports/kover/html-result"))
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

tasks.withType<Detekt>().configureEach {
    jvmTarget = "11"
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
