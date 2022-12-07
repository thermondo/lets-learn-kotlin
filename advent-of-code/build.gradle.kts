plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":utils"))
    testImplementation(kotlin("test"))
    testImplementation(project(":test-utils"))
}
