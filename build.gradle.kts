buildscript {
    val mcVersion

    repositories {
        mavenLocal()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        mavenLocal()
        maven {
            name = "fabric"
            url = uri("https://maven.fabric.net/")
        }
    }

}