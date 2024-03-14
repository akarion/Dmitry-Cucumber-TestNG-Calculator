plugins {
    kotlin("jvm") version "1.9.20"

}
rootProject.name
group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.testng:testng:7.8.0")
    testImplementation("org.testng:testng:7.8.0")
    implementation ("io.cucumber:cucumber-java:7.14.0")
    implementation ("io.cucumber:cucumber-testng:7.14.0")
    testImplementation ("io.cucumber:cucumber-picocontainer:7.14.0")
    implementation("com.beust:jcommander:1.82")

}

kotlin{
//    jvmToolchain(11)
}


tasks.register<Test>("unittests"){
    description = "Runs TestNG unit tests."
    useTestNG() {
        useDefaultListeners = true
        val dir = System.getProperty("outputDirectory")
        if(dir!=null){
            outputDirectory = file("$projectDir/"+dir)
        }else{
            outputDirectory =file("$projectDir/Reports")
        }

    }

}


tasks.register<JavaExec>("scenarios") {

    group = "verification"
    description = "Runs Cucumber tests."

    var cucumberHTMLoutput = ""

    if(project.properties["cucumberOutputDir"]?.toString()!=null){
        cucumberHTMLoutput = "${projectDir}/"+project.properties["cucumberOutputDir"].toString()+"/cucumber-report.html"}

    else{cucumberHTMLoutput = "${projectDir}/Reports/cucumber-report.html"

    }

    classpath = sourceSets["main"].runtimeClasspath + sourceSets["test"].runtimeClasspath
    mainClass.set("io.cucumber.core.cli.Main")
    args = listOf(
        "--plugin", "pretty",
        "--plugin", "html:$cucumberHTMLoutput", // HTML report plugin with output directory
        "--glue", "CucumberTests", "src/test/kotlin/CucumberTests"

    )
}

