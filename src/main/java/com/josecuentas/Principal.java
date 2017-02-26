package com.josecuentas;

import sun.rmi.runtime.Log;

import java.util.Objects;
import java.util.stream.IntStream;

/**
 * Created by iPibeDx on 26/02/17.
 * Base: http://www.arquitecturajava.com/trabajando-con-java-8-intstream/?utm_campaign=shareaholic&utm_medium=twitter&utm_source=socialnetwork
 */


public class Principal {
    public static void main(String[] args) {
        IntStream it = IntStream.of(1,2,3,4,5);
        it.forEach(Principal::print);
        //it.forEach(System.out::println);// equals
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}
