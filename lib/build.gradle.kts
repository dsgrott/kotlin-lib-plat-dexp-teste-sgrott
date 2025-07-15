plugins {
    id("com.android.library") version "8.4.0"
    id("maven-publish")
    kotlin("android") version "2.0.0"
}

group = "com.porto.lib.poc"
version = "1.0.0"

android {
    namespace = project.group.toString()
    compileSdk = 34

    defaultConfig { 
        minSdk = 19 
    }

    buildTypes { 
        release { 
            isMinifyEnabled = false 
        } 
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

}

kotlin {
    jvmToolchain(17)
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

afterEvaluate {

    //Publica local no formato .m2 (Maven)
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = project.group.toString()
                artifactId = rootProject.name 
                version = project.version.toString()
            }
        }
    }

}