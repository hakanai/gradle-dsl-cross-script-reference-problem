
inner class Libraries {
    val junit get() = dependencies.create("org.junit.jupiter:junit-jupiter-api:5.8.2")
    val junitParams get() = dependencies.create("org.junit.jupiter:junit-jupiter-params:5.8.2")

}

var libraries = Libraries()
project.extra["libraries"] = Libraries()
