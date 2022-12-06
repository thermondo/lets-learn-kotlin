plugins {
    kotlin("jvm")
    id("io.gitlab.arturbosch.detekt")
    id("org.jmailen.kotlinter")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}
