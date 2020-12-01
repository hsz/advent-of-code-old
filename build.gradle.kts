import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    groovy
    kotlin("jvm") version "1.4.20"
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

tasks {
    register("readme", Copy::class) {
        val list = project.sourceSets.main.get().allSource.files.filter {
            it.path.contains("""Day\d{2}\.kt$""".toRegex())
        }.map {
            val year = it.parentFile.name.substring(3)
            val day = it.nameWithoutExtension.substring(3)
            val title = """(Day \d+: .*)""".toRegex().find(it.readText())!!.value.substring(6).trim()
            val group = when (day) {
                "01" -> "**${year}**"
                else -> ""
            }

            mapOf("group" to group, "year" to year, "day" to day, "title" to title)
        }.sortedBy { it["day"] }.sortedByDescending { it["year"] }

        from(".") {
            include("README.template.md")
            rename { "README.md" }
            expand("list" to list)
        }

        into(".")
    }
}
