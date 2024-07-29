plugins {
    java
    application
}

application.mainClass = "com.github.erdi.jetty12094.Main"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.eclipse.jetty:jetty-bom:12.0.11"))
    implementation(platform("org.eclipse.jetty.ee9:jetty-ee9-bom:12.0.11"))
    implementation("org.eclipse.jetty:jetty-server")
    implementation("org.eclipse.jetty.ee9:jetty-ee9-webapp")
    runtimeOnly("org.eclipse.jetty:jetty-jndi")
    runtimeOnly("org.eclipse.jetty.ee9:jetty-ee9-plus")
}