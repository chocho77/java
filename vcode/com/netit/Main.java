package com.netit;

import com.netit.resorces.MyResorces;

public class Main {
    public static void main(String[] abs) {
        MyResorces myResorces = new MyResorces(1, "Chavdar", "Momchilov");
        String str = myResorces.toString();
        System.out.println("Hello, Java.");
        System.out.println(str);
    }

}
