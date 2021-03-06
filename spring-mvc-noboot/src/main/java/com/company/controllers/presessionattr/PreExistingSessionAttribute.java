package com.company.controllers.presessionattr;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

public class PreExistingSessionAttribute extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().contains("presessionattr")) {
            HttpSession session = request.getSession(true);
            if (session.getAttribute("sessionStartTime") == null) {
                session.setAttribute("sessionStartTime", LocalDateTime.now());
            }
        }
        return true;
    }
}
