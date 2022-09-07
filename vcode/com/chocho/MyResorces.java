package com.chocho;

public class MyResorces {

    private int id;
    private String firstName;
    private String lastName;

    public MyResorces(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "MyResorces [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + "]";
    }

}
