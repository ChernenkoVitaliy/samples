package com.company.sesions.sessionscope;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Visitor implements Serializable {
    private final String ip;
    private final List<String> pageVisited = new ArrayList<>();

    public Visitor(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public List<String> getPageVisited() {
        return pageVisited;
    }

    public void addPageVisited(String page) {
        pageVisited.add(page);
    }
}
