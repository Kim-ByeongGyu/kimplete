package com.example.day0418;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterTask implements Runnable{
    // 콘솔에서 데이터를 읽어 파일에 쓰는 스레드 구현 파일.
    @Override
    public void run() {
        try (FileWriter writer = new FileWriter("output.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String input;
            System.out.print("입력 : ");
            while (!(input = reader.readLine()).equals("")) {
                writer.write(input+"\n");
                System.out.print("입력 : ");
            }
            System.out.println("파일에 저장 완료");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
