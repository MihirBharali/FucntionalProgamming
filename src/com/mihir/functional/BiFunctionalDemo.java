package com.mihir.functional;

import java.util.function.BiFunction;

public class BiFunctionalDemo {

    public static void main(String args[]) {
          System.out.println(map().apply("Mihir ", "Bharali"));

    }

    private static BiFunction<String, String, String> map() {
        return (x,y) -> x.concat(y);
    }
}
