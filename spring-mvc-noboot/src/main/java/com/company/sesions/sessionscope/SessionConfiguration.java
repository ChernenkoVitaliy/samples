package com.company.sesions.sessionscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;

@Configuration
public class SessionConfiguration {

    @Bean
    @Scope(WebApplicationContext.SCOPE_SESSION)
    public Visitor visitor(HttpServletRequest request){
        return new Visitor(request.getRemoteAddr());
    }
}
