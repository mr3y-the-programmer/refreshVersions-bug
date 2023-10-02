// Top-level build file where you can add configuration options common to all sub-projects/modules.
@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.com.android.application) apply false
    alias(libs.plugins.org.jetbrains.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.jvm) apply false
//    alias(libs.plugins.compose.multiplatform) apply false
    id("org.jetbrains.compose") version "1.5.2" apply false
    id("com.squareup.wire") version "4.9.1" apply false
}
true // Needed to make the Suppress annotation work for the plugins block