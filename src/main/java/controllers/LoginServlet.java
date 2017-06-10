package controllers;

import dao.DaoFactory;
import models.User;
import utils.Password;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns="/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("user") != null) {
            resp.sendRedirect("/profile");
            return;
        }
        req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req,resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userName = req.getParameter("username");
        String password = req.getParameter("password");
        User user = DaoFactory.getUsersDao().findByUsername(userName);

        if(user == null){
            resp.sendRedirect("/login");
            return;
        }

        boolean validAttempt = Password.check(password, user.getPassword());

        if(validAttempt) {
            req.getSession().setAttribute("user", user);
            resp.sendRedirect("/profile");
        } else {
            resp.sendRedirect("/login");
        }
    }
}
