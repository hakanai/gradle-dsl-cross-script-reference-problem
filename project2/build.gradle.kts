plugins {
    kotlin("jvm") version "1.6.21"
    id("our.libraries")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

apply {
    from("../shared/gradle/test.gradle.kts")
}
