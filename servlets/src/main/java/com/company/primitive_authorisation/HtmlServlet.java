package com.company.primitive_authorisation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/html-servlet", "/servlet-html"})
public class HtmlServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User user = new User(login, password);

        req.setAttribute("user", user);
        req.getServletContext().getRequestDispatcher("/WEB-INF/jsp/login-html.jsp").forward(req, resp);
    }
}
