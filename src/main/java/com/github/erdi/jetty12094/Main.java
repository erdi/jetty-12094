package com.github.erdi.jetty12094;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.ee9.webapp.WebAppContext;
import javax.naming.InitialContext;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    void run() throws Exception {
        new InitialContext().lookup("java:comp");

        createServer(0).start();
        createServer(1).start();
    }

    Server createServer(int portOffset) {
        Server server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8090 + portOffset);
        server.setConnectors(new Connector[] {connector});

        WebAppContext handler = new WebAppContext();
        handler.setWar(Main.class.getProtectionDomain().getCodeSource().getLocation().toExternalForm());
        handler.addServlet(HelloWorldServlet.class, "/hello");
        server.setHandler(handler);

        return server;
    }
}
