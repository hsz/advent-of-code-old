import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.20"
}

group = "mobi.hsz"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
}

repositories {
    mavenCentral()
}

tasks {
    listOf("compileKotlin", "compileTestKotlin").forEach {
        getByName<KotlinCompile>(it) {
            kotlinOptions.jvmTarget = "1.8"
        }
    }

    withType<Test> {
        useJUnitPlatform()
    }

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
