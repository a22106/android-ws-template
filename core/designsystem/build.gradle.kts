plugins {
    alias(libs.plugins.piusdev.template.library)
    alias(libs.plugins.piusdev.template.library.compose)
}

android {
    namespace = "com.piusdev.core.designsystem"
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
//    lintPublish(projects.lint)

    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material.iconsExtended)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.ui.util)


    implementation(libs.coil.kt.compose)

    testImplementation(libs.androidx.compose.ui.test)
    testImplementation(libs.accompanist.testharness)
    testImplementation(libs.hilt.android.testing)
    testImplementation(libs.robolectric)
    testImplementation(libs.roborazzi)
    testImplementation(projects.core.testing)

    androidTestImplementation(libs.androidx.compose.ui.test)
    androidTestImplementation(projects.core.testing)
}