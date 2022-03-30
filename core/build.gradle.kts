plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management") version "1.0.11.RELEASE"

    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa") version "1.6.10"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}