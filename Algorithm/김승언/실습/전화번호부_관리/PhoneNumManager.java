package com.example.day0417.실습1;

import java.io.*;

public class PhoneNumManager {
    public static void main(String[] args) {
        String filePath = "c:/temp/phone.txt";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pw = new PrintWriter(new FileOutputStream(filePath))) {

            for (int i = 0; i < 3; i++) {
                System.out.print("이름: ");
                String name = br.readLine();

                System.out.print("전화번호: ");
                String phoneNumber = br.readLine();

                pw.println(name + " " + phoneNumber);
            }

            System.out.println("전화번호가 " + filePath + "에 저장되었습니다.\n");
            System.out.println(filePath + "의 내용은 다음과 같습니다...");

        } catch (FileNotFoundException e) {
            System.err.println("파일을 생성하는 중 오류가 발생했습니다: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("입출력 오류가 발생했습니다: " + e.getMessage());
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("파일을 찾을 수 없습니다: " + filePath);
        } catch (IOException e) {
            System.err.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}


