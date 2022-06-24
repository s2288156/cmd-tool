plugins {
    application
}

dependencies {
    implementation("commons-io:commons-io:2.11.0")
    implementation("ch.qos.logback:logback-classic:1.2.11")
    implementation("ch.qos.logback:logback-core:1.2.11")
    implementation("org.slf4j:slf4j-api:1.7.36")
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    implementation("commons-cli:commons-cli:1.5.0")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    @Suppress("VulnerableLibrariesLocal")
    implementation("com.alibaba:easyexcel:3.1.1")

    testImplementation("ch.qos.logback:logback-classic:1.2.11")
    testImplementation("ch.qos.logback:logback-core:1.2.11")
    testImplementation("org.slf4j:slf4j-api:1.7.36")
    testCompileOnly("org.projectlombok:lombok:1.18.24")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.24")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

application {
    mainClass.set("org.cmd.ExcelMain")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.compileJava {
    options.isIncremental = false
    options.encoding = "UTF-8"
}
