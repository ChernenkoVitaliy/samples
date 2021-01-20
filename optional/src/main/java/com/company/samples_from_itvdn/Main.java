package com.company.samples_from_itvdn;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> opt1 = Optional.empty();
        Optional<Integer> opt2 = Optional.of(10);
        Optional<Integer> opt3 = Optional.ofNullable(null);

        System.out.println(opt1);
        System.out.println(opt2);
        System.out.println(opt3);
    }
}
