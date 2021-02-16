package com.company.simple;

public class ExampleInterapt {
    private static class Counter extends Thread {
        @Override
        public void run() {
            int x = 1;
            while (!isInterrupted()) {
                System.out.println(getId() + ": " + x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            Counter counter = new Counter();
            counter.start();
            Thread.sleep(5000);
            counter.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
