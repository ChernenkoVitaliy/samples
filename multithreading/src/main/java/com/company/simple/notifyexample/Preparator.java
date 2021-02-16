package com.company.simple.notifyexample;

import java.io.RandomAccessFile;

public class Preparator extends Thread {
    private Data data;
    private String path;

    public Preparator(Data data, String path) {
        this.data = data;
        this.path = path;
    }

    @Override
    public void run() {
        byte[] buf;

        System.out.println("Data is being prepared...");

        try {
            RandomAccessFile fs = new RandomAccessFile(path, "r");
            try {
                buf = new byte[(int) fs.length()];
                fs.read(buf);
            }finally {
                fs.close();
            }
        }catch (Exception e) {
            buf = null;
        }

        synchronized (data) {
            data.setData(buf);
            data.notifyAll();
        }
    }
}
