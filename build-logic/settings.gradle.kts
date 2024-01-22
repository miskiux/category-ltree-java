dependencyResolutionManagement {
    repositories.mavenCentral()
    repositories.gradlePluginPortal()
    repositories.google()

    versionCatalogs.create("libs") {
        from(files("../libs.versions.toml"))
    }

    includeBuild("../platforms")
}

rootProject.name = "build-logic"

include("commons")
include("shared-spring")
include("spring-boot-application")
include("spring-boot-data")
