plugins {
    alias(libs.plugins.android.dynamic.feature)
    alias(libs.plugins.jetbrains.kotlin.android)
}
android {
    namespace = "app.ubuntufs"
    compileSdk = 35

    defaultConfig {
        minSdk = 29
        // testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    flavorDimensions += "variant"

    productFlavors {
        create("default") { dimension = "variant" }
        create("ludashi")  { dimension = "variant" }
        create("antutu")   { dimension = "variant" }
        create("pubg")     { dimension = "variant" }
    }

    buildTypes {
        create("release-signed") {
            initWith(getByName("release"))
        }
        create("release-gold") {
            initWith(getByName("release"))
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":app"))
    implementation(libs.androidx.core.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
