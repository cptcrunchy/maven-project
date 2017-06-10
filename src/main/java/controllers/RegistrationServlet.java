package controllers;

import dao.DaoFactory;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegistrationServlet", urlPatterns = "/register")
public class RegistrationServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       if(req.getSession().getAttribute("user") != null) {
           resp.sendRedirect("/profile");
           return;
       }
        req.getRequestDispatcher("/WEB-INF/register.jsp").forward(req,resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username  = req.getParameter("username");
        String email     = req.getParameter("email");
        String password  = req.getParameter("password");
        String chkpasswd = req.getParameter("confirm_password");

        //validate registration
        boolean inputHasErrors = username.isEmpty()
                || email.isEmpty()
                || password.isEmpty()
                || (!password.equals(chkpasswd));

        if(inputHasErrors){
            resp.sendRedirect("/register");
            return;
        }

        //Create/save new user
        User user = new User(username, email, password);
        DaoFactory.getUsersDao().insert(user);
        resp.sendRedirect("/login");
    }
}
