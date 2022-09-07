package com.chocho;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.forEach(integer -> list.get(0));
        
        System.out.println("Hooray my first java app");
    }
}
