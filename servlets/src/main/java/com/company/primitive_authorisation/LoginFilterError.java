package com.company.primitive_authorisation;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter", dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD}, urlPatterns = {"/secured/*"})
public class LoginFilterError implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        User user = (User) req.getSession().getAttribute("user");
        if (user == null) {
//            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
//            dispatcher.forward(req, res);
            throw new UserCredentialsNotValidException();
        }else  {
            chain.doFilter(req, res);
        }
    }

    @Override
    public void destroy() {

    }
}
