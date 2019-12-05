import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.50"
    id("com.adarshr.test-logger") version "2.0.0"
}

group = "mobi.hsz"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testApi("org.junit.jupiter:junit-jupiter-engine:5.5.2")
    testImplementation("org.assertj:assertj-core:3.14.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
}

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
