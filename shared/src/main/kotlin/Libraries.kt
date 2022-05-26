import org.gradle.api.artifacts.ModuleDependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.exclude

class Libraries(private var dependencies: DependencyHandler) {
    val junit get() = dependencies.create("org.junit.jupiter:junit-jupiter-api:5.8.2")
    val junitParams get() = dependencies.create("org.junit.jupiter:junit-jupiter-params:5.8.2")

    val xmlbeans get() = dependencies.create("org.apache.xmlbeans:xmlbeans:4.0.0").apply {
        this as ModuleDependency
        exclude(group = "stax", module = "stax-api")
    }
}
