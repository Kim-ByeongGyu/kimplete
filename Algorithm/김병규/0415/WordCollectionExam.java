package com.example.day0415;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCollectionExam {

    private static void input(Scanner sc, List<String> array) {
        String inputScanner = "";
        do {
            inputScanner = sc.next();
            array.add(inputScanner);
        } while (!inputScanner.equals("quit"));
    }

    private static void removeQuit(List<String> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals("quit")) {
                array.remove(i);
            }
        }
    }

    private static void print(List<String> array) {
        int count = 0;
        int length = 0;
        String maxStr = "";
        for (String str : array) {
            System.out.println(str);
            count += str.length();
            if (str.length() > length) {
                length = str.length();
                maxStr = str;
            }
        }
        System.out.println("단어의 수 >>> " + array.size());
        System.out.println("총 글자 수 >>> "+ count);
        System.out.println("가장 긴 단어" + maxStr + "길이 : " +length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strArray = new ArrayList<>();

        input(sc, strArray);
        removeQuit(strArray);
        print(strArray);
        sc.close();
    }
}
