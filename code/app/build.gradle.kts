import com.adobe.marketing.mobile.gradle.BuildConstants

plugins {
    id("com.android.application")
}

android {
      namespace = "com.adobe.marketing.mobile.edge.consent.consentTestApp"

    defaultConfig {
        applicationId = "com.adobe.marketing.mobile.edge.consent.consenttestapp"
        compileSdk = BuildConstants.Versions.COMPILE_SDK_VERSION
        minSdk = BuildConstants.Versions.MIN_SDK_VERSION
        targetSdk = BuildConstants.Versions.TARGET_SDK_VERSION
        versionCode = BuildConstants.Versions.VERSION_CODE
        versionName = BuildConstants.Versions.VERSION_NAME
    }

    buildTypes {
        getByName(BuildConstants.BuildTypes.RELEASE)  {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":edgeconsent"))
    implementation("com.adobe.marketing.mobile:core:2.+")
    implementation("com.adobe.marketing.mobile:assurance:2.+")
    implementation("com.adobe.marketing.mobile:edge:2.+")

    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}