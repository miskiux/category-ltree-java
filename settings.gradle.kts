plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
includeBuild("platforms")
includeBuild("build-logic")
includeBuild("application")

includeBuild("category-feature")
