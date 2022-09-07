package com.company.main;

import com.company.resources.MyClassImpl;

public class Main {
    public static void main(String[] args) {
        MyClassImpl myClassImpl = new MyClassImpl();
        int res = myClassImpl.sub(2, 3);
        System.out.println("res = " + res);
        System.out.println("Test message.");
        System.out.println("Test message.");
    }

}
