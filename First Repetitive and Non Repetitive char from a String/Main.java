package com.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String test = "thiss is";
        first(test);

    }

    public static void first(String string) {
        Map<Character, Integer> map = new LinkedHashMap<>(string.length());

        for (int i = 0; i < string.length(); i++) {
            char c = string.toLowerCase().charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);

            }
            if (map.get(c) == 1) {
                System.out.println("First non repetitive char is: " + c);
                break;
            }
//            if (map.get(c) == 2) {
//                System.out.println("First repetitive char is: " + c);
//                break;
//            }
        }
    }
}