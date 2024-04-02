package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class removeMinArr2 {
    public static void ArrayListTest(){
        List arrList = new ArrayList<String>();

        arrList.add("abc");
        arrList.add("second");
        arrList.add("thrid");

        System.out.println(arrList.get(0)); // abc
        System.out.println(arrList.size()); // 3
        System.out.println(arrList.remove(2));
        System.out.println(arrList.size()); // 2
        System.out.println(arrList.getLast()); // second


        for (int idx = 0; idx < arrList.size(); idx++){
            System.out.println(arrList.get(idx)); // abc, second
        }
    }

    public static void LinkedListTest(){
        List linkedList = new LinkedList<Integer>();

        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList.getLast()); // 4
        System.out.println(linkedList.size()); // 3

        linkedList.removeFirst();
        System.out.println(linkedList.getFirst()); // 3
        System.out.println(linkedList.size()); // 2

        System.out.println("cout everything");
        for (int idx = 0; idx < linkedList.size(); idx++){
            System.out.println(linkedList.get(idx)); // 3, 4
        }

    }
//    public static void streamAPITest(){
//
//    }
    public static void main(String[] args) {
         // ArrayListTest();
        LinkedListTest();
    }
}
