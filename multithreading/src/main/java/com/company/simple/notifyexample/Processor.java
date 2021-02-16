package com.company.simple.notifyexample;

import java.io.RandomAccessFile;

public class Processor extends Thread {
    private Data data;
    private String path;

    public Processor(Data data, String path) {
        this.data = data;
        this.path = path;
    }

    @Override
    public void run() {
        System.out.println("Waiting for data...");

        synchronized (data) {
            try {
                data.wait();
            } catch (InterruptedException e) {
                return;
            }
        }

        System.out.println("Got data. Processing it...");

        byte[] buf = data.getData();

        for (int i = 0; i < buf.length; i++) {
            buf[i]++;
        }

        try {
            RandomAccessFile f = new RandomAccessFile(path, "rw");

            try {
                f.write(buf);
            }finally {
                f.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
