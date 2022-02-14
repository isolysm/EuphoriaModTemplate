plugins {
    kotlin("jvm") version Dependencies.KOTLIN apply false
    kotlin("plugin.serialization") version Dependencies.KOTLIN apply false
    kotlin("multiplatform") version Dependencies.KOTLIN apply false

    // The Minecraft stuff
    id("fabric-loom") version Dependencies.FABRIC_LOOM apply false
    id("preprocessor") version Dependencies.PREPROCESSOR
}

configurations.register("compileClasspath")

preprocess {
   // The current version we support
    val mc11801 = createNode("1.18.1", 11801, "yarn")
}