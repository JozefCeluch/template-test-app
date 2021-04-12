plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(Versions.Sdk.compileSdk)

    defaultConfig {
        minSdkVersion(Versions.Sdk.minSdk)
        targetSdkVersion(Versions.Sdk.targetSdk)

        versionCode = Versions.App.versionCode
        versionName = Versions.App.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    }

    lintOptions {
        isWarningsAsErrors = true
        isAbortOnError = true
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk7"))

    implementation(SupportLibs.androidxAppcompat)
    implementation(SupportLibs.androidxCoreKtx)

    testImplementation(TestingLib.junit)

    androidTestImplementation(AndroidTestingLib.androidxTestRunner)
    androidTestImplementation(AndroidTestingLib.androidxExtJunit)
}
