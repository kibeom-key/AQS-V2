# Android Quick Starter V2 (NIA style)

- Android Studio Electric Eel | 2022.1.1 Patch 1
    - AGP : 7.4.1
    - gradle : 7.6

- NIA ([Now in Android](https://github.com/android/nowinandroid))
    - Kotlin & Jetpack Compose
    - [Architecture](https://github.com/android/nowinandroid/blob/main/docs/ArchitectureLearningJourney.md)
    - [Modularization](https://github.com/android/nowinandroid/blob/main/docs/ModularizationLearningJourney.md)
        - build-logic
        - version catalog
            - libs.versions.toml
    - [UI (Material 3)](https://www.figma.com/community/file/1164313362327941158/Now-In-Android-Case-Study)

- How to set with purity
    1. Code - Download ZIP
    2. Open project in AndroidStudio
    3. Preferences - Gradle JDK 11
    4. Rename Package Directories (All Directories) 
    5. Modify Namespace (All Modules)
    6. Rename Convention-Plugin's id  
    (build.gradle.kts (build-logic:convention-plugins))
    7. Modify plugin-id (All Modules)