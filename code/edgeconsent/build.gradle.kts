plugins {
    id("aep-library")
}

val mavenCoreVersion: String by project

aepLibrary {
    namespace = "com.adobe.marketing.mobile.edge.consent"

    publishing {
        gitRepoName = "aepsdk-edgeconsent-android"
        addCoreDependency(mavenCoreVersion)
    }

    enableSpotless = true
    enableSpotlessPrettierForJava = true
    enableCheckStyle = true
}

dependencies {
    implementation("com.adobe.marketing.mobile:core:$mavenCoreVersion")
}
