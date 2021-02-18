package com.company.sesions.sessionattr;

import java.util.ArrayList;
import java.util.List;

public class SessionAttrVisitor {
    private final String ip;
    private final List<String> pageVisited = new ArrayList<>();


    public SessionAttrVisitor(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void addPageVisited(String page) {
        pageVisited.add(page);
    }

    public List<String> getPageVisited() {
        return pageVisited;
    }
}
