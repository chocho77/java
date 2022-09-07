package com.company.resources;

public class MyClassImpl {

    private int a;

    private int b;

    public MyClassImpl() {
    }

    public MyClassImpl(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sub(int a, int b) {

        this.a = a;
        this.b = b;

        return a + b;
    }

}
