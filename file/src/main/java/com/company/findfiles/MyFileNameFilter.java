package com.company.findfiles;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileNameFilter {
    private static void findFiles(String srcPath, String ext, List<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles((file, s) -> s.endsWith(ext));

        for (File f : files) {
            list.add(f.getCanonicalPath());
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try {
            findFiles("file/etc", ".txt", list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
