import com.adobe.marketing.mobile.gradle.BuildConstants

plugins {
    id("com.android.application")
   // id("com.diffplug.spotless")
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    java {
        toggleOffOn("format:off", "format:on")
        target("src/*/java/**/*.java")
        removeUnusedImports()
        prettier(
                mapOf(
                        "prettier" to rootProject.extra["prettierVersion"].toString(),
                        "prettier-plugin-java" to rootProject.extra["prettierPluginJavaVersion"].toString()
                )
        ).config(
                mapOf(
                        "parser" to "java",
                        "tabWidth" to 4,
                        "useTabs" to true,
                        "printWidth" to 120
                )
        )
        endWithNewline()
        licenseHeaderFile("../../config/formatter/adobe.header.txt")
    }
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
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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