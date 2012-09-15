package com.jamesward;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;

public class Webapp {

    public static void main(String[] args) throws Exception{
        final int port = System.getenv("PORT") != null ? Integer.valueOf(System.getenv("PORT")) : 8080;
        Server server = new Server(port);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        server.start();
        server.join();   
    }
}

