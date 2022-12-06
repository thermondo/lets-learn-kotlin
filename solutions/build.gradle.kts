plugins {
    kotlin("jvm")
    id("io.gitlab.arturbosch.detekt")
    id("org.jmailen.kotlinter")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":utils"))
    testImplementation(kotlin("test"))
    testImplementation(project(":test-utils"))
}
