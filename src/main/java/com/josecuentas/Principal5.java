package com.josecuentas;

import java.util.Arrays;

/**
 * Created by iPibeDx on 26/02/17.
 */
public class Principal5 {

    public static void main(String[] args) {
        String[] cadenas = {"hello", "my", "name", "is", "José"};

        System.out.println(Arrays.stream(cadenas).mapToInt(String::length).average().getAsDouble());
    }
}
