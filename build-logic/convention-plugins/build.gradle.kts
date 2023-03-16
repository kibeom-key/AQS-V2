plugins {
    `kotlin-dsl`
}

group = "kb.example.qs.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(libs.android.gradlePlugin)  // com.android.tools.build:gradle
    compileOnly(libs.kotlin.gradlePlugin)   // org.jetbrains.kotlin:kotlin-gradle-plugin
    compileOnly(libs.ksp.gradlePlugin)      // com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "nia.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidLibrary") {
            id = "nia.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("androidApplicationCompose") {
            id = "nia.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("androidLibraryCompose") {
            id = "nia.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

    }
}