package com.example.day0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserInputHandler {
    public List<String> getUserInput() {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            String str;
            System.out.println("입력 (엔터 두번 입력 시 종료)");
            while (!(str = br.readLine()).equals("")) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
