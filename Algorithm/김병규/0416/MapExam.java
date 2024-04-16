package com.example.day0416;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(111, "kim");
        map.put(222, "kang");
        map.put(333, "hong");
        map.put(444, "lee");
        map.put(555, "bae");

        System.out.println(map);

        System.out.println(map.get(444));

        // 출력 1
        System.out.println("---출력 1---Iterator-------------------------------");
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> keyIter =keySet.iterator();
        while (keyIter.hasNext()) {
            Integer key = keyIter.next();
            System.out.print("key : " + key);
            System.out.println("    value : " + map.get(key));
        }

        // 출력 2
        System.out.println("---출력 2---for-each-----------------------------------");
        for (Integer key : keySet) {
            System.out.print("key : " + key);
            System.out.println("    value : " + map.get(key));
        }

        // 출력3
        System.out.println("---출력 3---Map.Entry----------------------------------");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print("key : " + entry.getKey());
            System.out.println("    value : " + entry.getValue());
        }
    }
}
