package com.minvoo.trash;

import java.util.*;

public class HashRemind {

    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>(); // HashSet - random // TreeSet - alphabetical // LinkedHashSet - as provided in program

        set.add(12);
        set.add(333);
        set.add(2000);
        set.add(5);


        set.forEach(System.out::println);

        Map<String, Integer> map = new HashMap<>(); // HashSet - random // TreeSet - alphabetical // LinkedHashSet - as provided in program

        map.put("One", 1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("For",4);
        map.put("Five",5);
        map.put("Six",6);
        map.put("Seven",7);
        map.put("Eight",8);
        map.put("Nine",9);
        map.put("Ten",10);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key [" + entry.getKey()+"] Value: ["+entry.getValue()+"]");
        }
    }
}
