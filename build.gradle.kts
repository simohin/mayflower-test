import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.2.3"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.23"
    kotlin("plugin.spring") version "1.9.23"
    kotlin("plugin.noarg") version "1.9.23"
}

group = "ru.simohin"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

noArg {
    annotations("ru.simohin.mayflower.test.annotation.NoArg")
}

repositories {
    mavenCentral()
}

val feignJacksonVersion = "13.2.1"
val feignStarterVersion = "4.1.0"
val thymeleafVersion = "3.2.3"
val springdocVersion = "2.4.0"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:$springdocVersion")
    implementation("com.h2database:h2")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign:$feignStarterVersion")
    implementation("io.github.openfeign:feign-jackson:$feignJacksonVersion")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:$thymeleafVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.getByName<Jar>("jar") {
    enabled = false
}

tasks.withType<Test> {
    useJUnitPlatform()
}
