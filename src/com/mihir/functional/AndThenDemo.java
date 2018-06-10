package com.mihir.functional;

import java.util.function.Function;

public class AndThenDemo {

    public static void main(String args[]) {
        System.out.println(convert().andThen(getLastChar()).apply("its "));

    }

    private static Function<String, String> convert() {
       return s -> s.toUpperCase();
    }

    private static Function<String, String> getLastChar() {
        return s -> s.concat("DONE");
    }
}
