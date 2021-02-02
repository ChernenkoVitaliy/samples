package com.company.io.simple;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayStreamSimpleExample {
    public static void main(String[] args) {
        byte[] a = {1, 2, 3};
        byte[] b = {4, 5};
        byte[] c = {6, 7, 8, 9};

        try(ByteArrayOutputStream bs = new ByteArrayOutputStream()) {
            bs.write(a);
            bs.write(b);
            bs.write(c);

            byte [] res = bs.toByteArray();
            System.out.println(Arrays.toString(res));
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
