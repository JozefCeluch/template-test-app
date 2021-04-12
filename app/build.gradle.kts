plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(Versions.Sdk.compileSdk)
    defaultConfig {
        minSdkVersion(Versions.Sdk.minSdk)
        targetSdkVersion(Versions.Sdk.targetSdk)

        applicationId = "com.github.jozefceluch.templatetestapp.app"
        versionCode = Versions.App.versionCode
        versionName = Versions.App.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("debug") {
            debuggable(true)
            isMinifyEnabled = false
            applicationIdSuffix(".debug")
        }
        all {
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    lintOptions {
        isWarningsAsErrors = true
        isAbortOnError = true
    }

    // Use this block to configure different flavors
//    flavorDimensions("version")
//    productFlavors {
//        create("full") {
//            dimension = "version"
//            applicationIdSuffix = ".full"
//        }
//        create("demo") {
//            dimension = "version"
//            applicationIdSuffix = ".demo"
//        }
//    }
}

dependencies {
    implementation(kotlin("stdlib-jdk7"))

    implementation(project(":library-android"))
    implementation(project(":library-kotlin"))

    implementation(SupportLibs.androidxAppcompat)
    implementation(SupportLibs.androidxConstraintLayout)
    implementation(SupportLibs.androidxCoreKtx)

    testImplementation(TestingLib.junit)

    androidTestImplementation(AndroidTestingLib.androidxExtJunit)
    androidTestImplementation(AndroidTestingLib.androidxTestRules)
    androidTestImplementation(AndroidTestingLib.espressoCore)
}
