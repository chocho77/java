package com.netit.main;

import com.netit.resources.MyClassImpl;

public class Main {

    public static void main(String[] args) {

        MyClassImpl myClassImpl = new MyClassImpl(2.1, 3.4, 5.6);

        double res = myClassImpl.getA();

        System.out.println("res = " + res);

    }

}
