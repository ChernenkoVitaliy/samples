package com.company.io.simple;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamSimpleExample {

    private static void copyFile(String src, String dest) throws Exception {
        FileInputStream in = new FileInputStream(src);
        try {
            FileOutputStream out = new FileOutputStream(dest);
            try {
                byte[] buff = new byte[1024];
                int r = 0;

                do {
                    r = in.read(buff, 0, buff.length);
                    if (r > 0) {
                        out.write(buff, 0, r);
                    }
                }while (r > 0);

            }finally {
                out.close();
            }
        }finally {
            in.close();
        }
    }
}
