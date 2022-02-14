plugins {
    kotlin("jvm") version Dependencies.KOTLIN apply false
    id("fabric-loom") version Dependencies.FABRIC_LOOM apply false
    id("preprocess") version Dependencies.PREPROCESSOR
}

configurations.register("compileClasspath")

preprocess {
   // The current version we support
    val mc11801 = createNode("1.18.1", 11801, "yarn")
}