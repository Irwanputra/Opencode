plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "id.wanz.tunnel"
    compileSdk = 34
    defaultConfig {
        applicationId = "id.wanz.tunnel"
        minSdk = 29
        targetSdk = 34
        versionCode = 4
        versionName = "2.2"
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("debug") // APK langsung bisa dipasang; ganti dengan keystore sendiri untuk rilis
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation("com.github.mwiede:jsch:0.2.17") // pustaka SSH
    implementation(files("libs/hev-socks5-tunnel.aar")) // tun2socks untuk mode VPN
    testImplementation("junit:junit:4.13.2")
}
