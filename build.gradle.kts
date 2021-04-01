plugins {
    java
    kotlin("jvm") version "1.4.10"
}

group = "com.kotlin.project"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
    testCompile("junit", "junit", "4.12")
}
