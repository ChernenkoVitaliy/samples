package com.company.sesions.sessionscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.inject.Provider;


@Controller
@RequestMapping("sessionscope/trades")
public class SessionScopeTradeController {

    private final Provider<Visitor> visitorProvider;

    public SessionScopeTradeController(Provider<Visitor> visitorProvider) {
        this.visitorProvider = visitorProvider;
    }

    @RequestMapping("/**")
    public String handleRequestById(Model model, HttpServletRequest request) {
        model.addAttribute("msg", "trades request, serving page " + request.getRequestURI());
        System.out.println(request.getSession().getId());
        visitorProvider.get()
                .addPageVisited(request.getRequestURI());

        return "session-trade-page";
    }
}
