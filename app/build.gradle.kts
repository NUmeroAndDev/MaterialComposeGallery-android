plugins {
    id("buildlogic.conventions.appmodule")
}

android {
    namespace = "jp.numero.material_compose_gallery"

    defaultConfig {
        applicationId = "jp.numero.material_compose_gallery"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isShrinkResources = true
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        buildConfig = true
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(projects.data)
    implementation(projects.dataImpl)
    implementation(projects.feature.home)
    implementation(projects.feature.m2overview)
    implementation(projects.feature.m3overview)

    implementation(libs.androidxActivity)
    implementation(libs.androidxCore)
    implementation(libs.androidxCoreSplash)
    implementation(libs.androidxComposeMaterial3)
    implementation(libs.androidxProfileInstaller)
}