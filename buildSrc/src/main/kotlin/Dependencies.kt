
object Versions {
    object App {
        const val versionName = "1.0.0"
        const val versionCode = 1
    }

    object Sdk {
        const val minSdk = 26
        const val targetSdk = 30
        const val compileSdk = 30
    }

    object BuildPlugins {
        const val detekt = "1.16.0"
        const val ktlint = "10.0.0"
        const val versions = "0.38.0"
    }

   object Libraries {
    const val androidxTest = "1.3.0"
    const val ktlint = "0.40.0"
   }
}

object SupportLibs {
    const val androidxAppcompat = "androidx.appcompat:appcompat:1.2.0"
    const val androidxConstraintLayout = "com.android.support.constraint:constraint-layout:2.0.4"
    const val androidxCoreKtx = "androidx.core:core-ktx:1.3.2"
}

object TestingLib {
    const val junit = "junit:junit:4.13.2"
}

object AndroidTestingLib {
    const val androidxTestRules = "androidx.test:rules:${Versions.Libraries.androidxTest}"
    const val androidxTestRunner = "androidx.test:runner:${Versions.Libraries.androidxTest}"
    const val androidxExtJunit = "androidx.test.ext:junit:1.1.2"
    const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
}
