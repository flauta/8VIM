@file:Suppress("DSL_SCOPE_VIOLATION")
buildscript {
    dependencies {
       classpath(libs.gradle)
    }
}

plugins {
    alias(libs.plugins.agp.application) apply false
    alias(libs.plugins.ktlint) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.mannodermaus.android.junit5) apply false
    alias(libs.plugins.mikepenz.aboutlibraries) apply false
}