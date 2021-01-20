package com.company.filters;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/TestServlet", "/filtered/TestServlet"})
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println(req.getMethod());
        writer.println(req.getRequestURL());
        writer.println(req.getProtocol());
        writer.println(req.getRemoteAddr());
        writer.println(req.getContextPath());
        writer.println(req.getScheme());
        resp.setContentType("text/html;charset=UTF-8");
        writer.println("bar");
    }
}
