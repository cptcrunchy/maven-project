package controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name= "controllers.CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet{
    private static int pgView = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        pgView++;

        PrintWriter out = res.getWriter();

        if(req.getParameter("reset") != null) {
            pgView = 0;
        }
        pgView++;
        out.println("<!DOCTYPE html>");
        out.printf("<h1>You have visited this page %d many times", pgView);

    }
}
