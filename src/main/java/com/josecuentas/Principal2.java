package com.josecuentas;

import java.util.stream.IntStream;

/**
 * Created by iPibeDx on 26/02/17.
 */
public class Principal2 {

    public static void main(String[] args) {
        IntStream it = IntStream.range(0, 100);
        it.forEach(System.out::println);

        System.out.println(IntStream.range(0, 100).sum());
    }
}
