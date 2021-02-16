package com.company.simple;

public class ExampleJoin {
    private static class Counter extends Thread {
        @Override
        public void run() {
            int x = 1;
            while (x < 1000) {
                System.out.println(x++);
            }
        }
    }


    public static void main(String[] args) {
        try {
            Counter counter = new Counter();
            counter.start(); //start thread
            counter.join(); //waiting before Counter finish

            System.out.println("Thread-finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
