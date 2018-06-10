package com.mihir.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalDemo {

    public static void main(String args[]){

        List<Source> sources = Arrays.asList(new Source("Mihir", "Bharali"), new Source("Abc", "def"));
        Destination dest = sources.stream()
                .map(s -> convert().apply(s))
                .findAny()
                .orElse(null);

        System.out.println(dest.getName());

    }

    private static Function<Source, Destination> convert() {
        return sournce -> new Destination(sournce.getFirstName() + " " + sournce.getLastName());
    }


}
