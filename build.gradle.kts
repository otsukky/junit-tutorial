plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    // https://mvnrepository.com/artifact/org.hamcrest/hamcrest
    testImplementation("org.hamcrest:hamcrest:2.1")

}

tasks.test {
    useJUnitPlatform()
}