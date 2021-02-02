package com.company.io.simple;

import java.io.*;
import java.util.Arrays;


public class DataStreamSimpleExample {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);

        try {
            dos.writeInt(777);
            dos.writeUTF("Some utf text");
        }finally {
            dos.close();
        }

        byte[] arr = bos.toByteArray();
        System.out.println(Arrays.toString(arr));

        ByteArrayInputStream bis = new ByteArrayInputStream(arr);
        DataInputStream dis = new DataInputStream(bis);

        try {
            int x = dis.readInt();
            String s = dis.readUTF();

            System.out.println(x + ", " + s);
        }finally {
            dis.close();
        }

    }
}
