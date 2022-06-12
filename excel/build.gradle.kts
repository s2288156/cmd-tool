plugins {
    java
}

dependencies {
    implementation("commons-cli:commons-cli:1.5.0")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    @Suppress("VulnerableLibrariesLocal")
    implementation("com.alibaba:easyexcel:3.1.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
