plugins {
    java
    scala
    groovy
    kotlin("jvm") version "2.3.21"
    jacoco
    checkstyle
    pmd
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.3.7")
    implementation("org.codehaus.groovy:groovy:3.0.25")
    implementation(kotlin("stdlib"))

    testImplementation(platform("org.junit:junit-bom:6.0.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}