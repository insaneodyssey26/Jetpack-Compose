// Top-level build file for an empty Jetpack Compose project
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

buildscript {
    extra["lifecycle_version"] = "2.5.1"
}
