plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation("io.rest-assured:rest-assured:6.0.0")
    testImplementation("org.testng:testng:7.11.0")
    implementation("tools.jackson.core:jackson-databind:3.0.3")
    testImplementation("org.slf4j:slf4j-simple:2.0.17")
    implementation("io.github.cdimascio:dotenv-java:3.2.0")
    implementation("com.google.code.gson:gson:2.13.2")
}

tasks.test {
    useTestNG()

    // Show test output
    testLogging {
        events ("passed", "failed", "skipped");
        showStandardStreams = true;
    }
}