pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("../build-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs.create("libs") {
        from(files("../libs.versions.toml"))
    }
}

includeBuild("../platforms")
