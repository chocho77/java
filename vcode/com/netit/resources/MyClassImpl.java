package com.netit.resources;

public class MyClassImpl {

    private double a = 0;
    private double b = 0;
    private double c = 0;

    public MyClassImpl(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double volume() {

        double a = this.a;
        double b = this.b;
        double c = this.c;
        double res = a * b * c;

        return res;
    }

}
