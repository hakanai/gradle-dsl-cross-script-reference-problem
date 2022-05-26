// This fails because we can't reference Libraries from here
val libraries: Libraries by project.extra

allprojects {
    dependencies {
        "testImplementation"(libraries.junit)
        "testImplementation"(libraries.junitParams)
    }
}
