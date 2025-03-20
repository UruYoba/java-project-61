plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.52.0"
    application
    checkstyle
    id("org.sonarqube") version "6.0.1.5171"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "UruYoba_java-project-61")
        property("sonar.organization", "uruyoba")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}
