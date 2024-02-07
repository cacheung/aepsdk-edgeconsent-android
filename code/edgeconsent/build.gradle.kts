plugins {
    id("aep-library")
}

val mavenCoreVersion: String by project
val mavenEdgeVersion: String by project

aepLibrary {
    namespace = "com.adobe.marketing.mobile.edge.consent"
    enableSpotlessPrettierForJava = true
    enableCheckStyle = true
 
    publishing {
        gitRepoName = "aepsdk-edgeconsent-android"
        addCoreDependency(mavenCoreVersion)
    }
}

dependencies {
    implementation("com.adobe.marketing.mobile:core:$mavenCoreVersion-SNAPSHOT")
    implementation("com.adobe.marketing.mobile:edge:$mavenEdgeVersion")

    testImplementation ("com.fasterxml.jackson.core:jackson-databind:2.12.7")
    testImplementation ("org.json:json:20180813")

    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation ("com.fasterxml.jackson.core:jackson-databind:2.12.7")
}
