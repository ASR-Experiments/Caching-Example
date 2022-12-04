plugins {
//    Important
    java
    id("org.springframework.boot") version "2.7.6"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
//    Can be ignored
    id("org.sonarqube") version "3.5.0.2730"
    id("org.springdoc.openapi-gradle-plugin") version "1.5.0"
}

group = "com.personal.asr"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

sonarqube {
    properties {
        property("sonar.projectKey", "caching-example")
        property("sonar.organization", "my-experiments")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.exclusions", "**/build/**/*")
    }
}

dependencies {
//    Mandatory
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-web")
//    Specific to MySQL
    runtimeOnly("com.mysql:mysql-connector-j")
//    Can be ignored
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
//    Lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
//    Open API Spec
    implementation("org.springdoc:springdoc-openapi-ui:1.6.13")
    implementation("org.springdoc:springdoc-openapi-data-rest:1.6.13")
    implementation("org.springdoc:springdoc-openapi-javadoc:1.6.13")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
