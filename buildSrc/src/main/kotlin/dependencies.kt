@file:Suppress("ClassName", "unused")

object Build {
    const val applicationId = "com.ivianuu.ksettings.sample"
    const val buildToolsVersion = "28.0.3"
    const val compileSdk = 28
    const val minSdk = 17
    const val targetSdk = 28

    const val versionCode = 1
    const val versionName = "0.0.1"
}

object Publishing {
    const val groupId = "com.ivianuu.ksettings"
    const val vcsUrl = "https://github.com/IVIanuu/ksettings"
    const val version = "${Build.versionName}-dev12"
}

object Versions {
    const val androidGradlePlugin = "3.5.1"
    const val androidxAppCompat = "1.1.0"
    const val androidxLifecycle = "2.2.0-alpha05"
    const val bintray = "1.8.4"
    const val coroutines = "1.3.2"
    const val kotlin = "1.3.50"
    const val mavenGradle = "2.1"
    const val rxJava = "2.2.10"
}

object Deps {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"

    const val androidxLifecycleLiveData =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.androidxLifecycle}"

    const val bintrayGradlePlugin =
        "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintray}"

    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val mavenGradlePlugin =
        "com.github.dcendents:android-maven-gradle-plugin:${Versions.mavenGradle}"

    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
}