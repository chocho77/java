package com.netit;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(9);
        list.add(10);
        list.add(12);
        for (Integer integer : list) {
            System.out.print(integer);
            System.out.print(" ");

        }

    }

}
