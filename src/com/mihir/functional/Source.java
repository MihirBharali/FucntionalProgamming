package com.mihir.functional;

public class Source {
    public Source(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private final String firstName;
    private final String lastName;


}
