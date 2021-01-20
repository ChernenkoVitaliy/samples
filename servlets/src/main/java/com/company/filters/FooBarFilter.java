package com.company.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "FooBarFilter", urlPatterns = {"/filtered/*"})
public class FooBarFilter implements Filter {
    private FilterConfig filterConfig;


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        CharResponseWrapper wrappedResponse = new CharResponseWrapper((HttpServletResponse) response);

        doBeforeProcessing(request, wrappedResponse);

        chain.doFilter(request, wrappedResponse);

        doAfterProcessing(request, wrappedResponse);

        out.write(wrappedResponse.toString());
    }

    private void doBeforeProcessing(ServletRequest request, ServletResponse response) throws IOException {
        try(PrintWriter out = response.getWriter()) {
            out.print("foo--");
            out.flush();
        }
    }

    private void doAfterProcessing(ServletRequest request, ServletResponse response) throws IOException {
        try(PrintWriter out = response.getWriter()) {
            out.print("--bar");
            out.flush();
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void destroy() {

    }
}
