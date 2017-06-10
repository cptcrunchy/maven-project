package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name= "controllers.HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
       String name = req.getParameter("name");
        if(name.isEmpty()){
            name = "world";
        }
        req.setAttribute("name", name);
        req.setAttribute("lastName", "Gutierrez");
        req.getRequestDispatcher("/hello.jsp").forward(req, res);

    }
}
