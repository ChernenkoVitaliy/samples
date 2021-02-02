package com.company.simple;

import java.io.File;

public class MyClass {
    public static void main(String[] args) {
        try {
            File f = new File("file/etc");
            String[] list1 = f.list();
            File[] list2 = f.listFiles();

            for(String s : list1)
                System.out.println(s);

            for (File file : list2)
                System.out.println(file.getCanonicalPath());

            //list2[0].delete(); //deleting file
            long size = list2[0].length(); //file size
            long date = list2[0].lastModified();
            boolean b = f.isDirectory();

            new File("file/etc/dir").mkdir();
            new File("file/etc/dirs/1/2/3").mkdirs();

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
