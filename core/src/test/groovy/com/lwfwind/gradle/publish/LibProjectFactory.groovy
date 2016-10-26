package com.lwfwind.gradle.publish

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder

final class LibProjectFactory {

    public static Project createFromFixture() {
        Project project = ProjectBuilder.builder().withProjectDir(new File(TestConfiguration.FIXTURE_WORKING_DIR)).build()
        project.apply plugin: 'com.android.library'
        project.version = "1.0"
        project.group = "com.lwfwind.demo.gradle.publish"
        project.android {
            compileSdkVersion 23
            buildToolsVersion '23.0.3'

            defaultConfig {
                versionCode 1
                versionName '1.0'
                minSdkVersion 23
                targetSdkVersion 23
            }
        }

        return project
    }

    public static Project createFromFixtureWithFlavors() {
        Project project = ProjectBuilder.builder().withProjectDir(new File(TestConfiguration.FIXTURE_WORKING_DIR)).build()
        project.apply plugin: 'com.android.library'
        project.version = "1.0"
        project.group = "com.lwfwind.demo.gradle.publish"
        project.android {
            compileSdkVersion 23
            buildToolsVersion '23.0.3'

            defaultConfig {
                versionCode 1
                versionName '1.0'
                minSdkVersion 23
                targetSdkVersion 23
            }

            productFlavors {
                flavor1 {}
                flavor2 {}
            }
        }

        return project

    }
}
