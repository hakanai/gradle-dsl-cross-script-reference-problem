plugins {
    kotlin("jvm") version "1.6.21"
    id("our.libraries")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

apply {
    from("../shared/gradle/test.gradle.kts")
}

dependencies {
    implementation(kotlin("stdlib"))

    val libraries: Libraries by project.extra
    implementation(libraries.xmlbeans)
}
