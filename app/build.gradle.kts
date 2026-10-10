
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.mignon.linux"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.mignon.linux"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}
