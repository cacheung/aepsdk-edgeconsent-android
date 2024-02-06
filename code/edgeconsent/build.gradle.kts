plugins {
    id("aep-library")
}

val mavenCoreVersion: String by project

aepLibrary {
    namespace = "com.adobe.marketing.mobile.edge.consent"

    enableSpotless = false
    enableSpotlessPrettierForJava = false
    enableCheckStyle = false

    publishing {
        gitRepoName = "aepsdk-edgeconsent-android"
        addCoreDependency(mavenCoreVersion)
    }
}

dependencies {
    implementation("com.adobe.marketing.mobile:core:$mavenCoreVersion-SNAPSHOT")
}
