/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.4.2/samples
 */
plugins {
    idea
}

allprojects {
    group = "org.cmd"
    version = "0.0.1"

    apply(plugin = "idea")

    repositories {
        maven {
            setUrl("https://maven.aliyun.com/repository/public/")
        }
        mavenCentral()
    }
}

