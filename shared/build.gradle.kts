plugins {
    // kotlin("jvm") version "1.4.31" // matching version needed by kotlin-dsl
    `kotlin-dsl`
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}