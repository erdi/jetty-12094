package com.github.erdi.jetty12094;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        response.setContentType("text/plain");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("Hello world!");
    }
}
