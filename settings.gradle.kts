pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "quickstarter-nia-style"
include(":app")
include(":core")
include(":core:designsystem")
include(":feature")
include(":core:common")
include(":core:domain")
include(":core:database")
include(":core:data")
include(":core:model")
include(":core:network")
include(":core:ui")
