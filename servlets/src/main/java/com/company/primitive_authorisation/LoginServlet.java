package com.company.primitive_authorisation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    static List<User> loggedUser = new ArrayList<>();

    static {
        User user = new User();
        user.setLogin("test");
        user.setPassword("test");
        user.setFirstName("John");
        user.setLastName("Smith");
        loggedUser.add(user);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        if (user != null && password != null) {
            request.login(user, password);
        }

        userDetails(response.getWriter(), request);
    }

    private void userDetails(PrintWriter out, HttpServletRequest request) {
        out.println("isUserRole?" + request.isUserInRole("g1"));
        out.println("getRemoteUser" + request.getRemoteUser());
        out.println("getUserPrincipal?" + request.getUserPrincipal());
        out.println("getAuthType?" + request.getAuthType());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        Optional<User> logged = loggedUser.stream().filter(user -> user.getLogin().equals(login) && user.getPassword().equals(password)).findAny();
        if (logged.isPresent()) {
            HttpSession session = req.getSession(true);
            session.setAttribute("user", logged.get());
        }

        req.getRequestDispatcher("/secured/info").forward(req, resp);
    }
}
