plugins {
    kotlin("jvm")
    id("io.gitlab.arturbosch.detekt")
    id("org.jmailen.kotlinter")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.9.1")
}
