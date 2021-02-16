package com.company.simple.notifyexample;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        Processor processor = new Processor(data, "out.txt");
        processor.start();

        Preparator preparator = new Preparator(data, "in.txt");
        preparator.start();
    }
}
