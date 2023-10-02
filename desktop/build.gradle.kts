plugins {
    alias(libs.plugins.kotlin.jvm)
//    alias(libs.plugins.compose.multiplatform)
    id("org.jetbrains.compose")
    application
}

dependencies {

}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

application {
    mainClass.set("MainKt")
}
