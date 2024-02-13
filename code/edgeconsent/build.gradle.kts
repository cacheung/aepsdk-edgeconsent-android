plugins {
    id("aep-library")
}

val mavenCoreVersion: String by project
val mavenEdgeVersion: String by project

aepLibrary {
    namespace = "com.adobe.marketing.mobile.edge.consent"
    enableSpotless = true
    enableCheckStyle = true
 
    publishing {
        gitRepoName = "aepsdk-edgeconsent-android"
        addCoreDependency(mavenCoreVersion)
        addEdgeDependency(mavenEdgeVersion)
    }
}

dependencies {
    implementation("com.adobe.marketing.mobile:core:$mavenCoreVersion-SNAPSHOT")
    implementation("com.adobe.marketing.mobile:edge:$mavenEdgeVersion")

    // testImplementation dependencies provided by aep-library:
    // MOCKITO_CORE, MOCKITO_INLINE, JSON

    testImplementation ("com.fasterxml.jackson.core:jackson-databind:2.12.7")

    // androidTestImplementation dependencies provided by aep-library:
    // ANDROIDX_TEST_EXT_JUNIT, ESPRESSO_CORE

    androidTestImplementation ("com.fasterxml.jackson.core:jackson-databind:2.12.7")
}
