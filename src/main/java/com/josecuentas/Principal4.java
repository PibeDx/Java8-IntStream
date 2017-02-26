package com.josecuentas;

/**
 * Created by iPibeDx on 26/02/17.
 */
public class Principal4 {

    public static void main(String[] args) {
        String[] cadenas = {"hello", "my", "name", "is", "José"};

        double total = 0;
        double media = 0;

        for (int i = 0; i < cadenas.length; i++) {
            total += cadenas[i].length();
        }

        media = total / cadenas.length;

        System.out.println(media);
    }



}
