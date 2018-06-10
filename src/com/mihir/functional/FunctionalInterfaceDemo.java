package com.mihir.functional;

@FunctionalInterface
interface Concat {
    String convert(String a, String b);
}


public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        Concat func = (x,y) -> x.concat(y);

        System.out.println(func.convert("Mihir", " Bharali"));
    }
}