package com.example.day0418;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderTask implements Runnable{
    // 파일에서 데이터를 읽어 콘솔에 출력하는 스레드 구현 파일.
    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
