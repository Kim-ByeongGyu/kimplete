package com.example.day0417;

import java.io.*;
import java.util.Scanner;

public class Example01 {
    public static void 입력() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter writer = new PrintWriter(new FileOutputStream("phone.txt"));)
        {
            int cnt = 0;
            String name;
            String ph;

            while (cnt < 3) {
                System.out.print("이름 : ");
                name = br.readLine();
                System.out.print("전화번호 : ");
                ph = br.readLine();
                String phdash = ph.substring(0,3) + "-" + ph.substring(3,7) + "-" + ph.substring(7);
                System.out.println(name + " " + phdash);

                writer.write(name + " " + phdash + "\n");
                cnt++;
                if (cnt == 3) {
                    System.out.println("...전화번호가 phone.txt에 저장되었습니다.\n\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void 출력() {
        try (BufferedReader br = new BufferedReader(new FileReader("phone.txt"))) {
            String line;
            System.out.println("...phone.txt의 내용은 다음과 같습니다...");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        입력();
        출력();
    }
}
