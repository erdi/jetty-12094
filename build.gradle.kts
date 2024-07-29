plugins {
    java
    application
}

application.mainClass = "com.github.erdi.jetty12094.Main"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.eclipse.jetty:jetty-bom:11.0.22"))
    implementation("org.eclipse.jetty:jetty-server")
    implementation("org.eclipse.jetty:jetty-webapp")
    runtimeOnly("org.eclipse.jetty:jetty-jndi")
    runtimeOnly("org.eclipse.jetty:jetty-plus")
}