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
include(":core:domain")
include(":core:database")
include(":core:network")
include(":core:ui")
include(":core:data")
include(":core:common")
include(":core:model")
