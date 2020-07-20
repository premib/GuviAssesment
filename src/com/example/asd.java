package com.example;

import java.util.HashMap;
import java.util.Map;

public class asd {

    public static void main(String[] args) {
        Map<Integer, String> nss = new HashMap<>();
        nss.put(1, "!!!");
        System.out.println(nss.containsKey(1));
        System.out.println(nss.get(1));
        nss.remove(1);
        System.out.println(nss.containsKey(1));
        System.out.println(nss.get(1));

    }
}
