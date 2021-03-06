pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        jcenter()
        mavenCentral()
        google()
        maven("https://jitpack.io")
        maven("https://maven.fabricmc.net")
        flatDir {
            dirs=setOf(file("../../libs"))
        }
    }
    resolutionStrategy {
        eachPlugin{
            when (requested.id.id) {
                "com.replaymod.preprocess" -> {
                    useModule("com.github.replaymod.preprocessor:${requested.version}")
                }
            }
        }
    }
}

rootProject.name = "template"
rootProject.buildFileName = "root.gradle.kts"

listOf(
    "1.18.1"
).forEach { version ->
    include(":$version")
    project(":$version").apply {
        projectDir = file("version/$version")
        buildFileName = "../../build.gradle"
    }
}