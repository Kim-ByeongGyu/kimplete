package com.example.day0418;

public class FileReadWriteApp {
    // 메인 메소드를 포함하며, 두 스레드를 생성하고 실행하는 메인 클래스 파일.

    public static void main(String[] args) {
        Thread reader = new Thread(new FileReaderTask());
        Thread writer = new Thread(new FileWriterTask());

        reader.start();
        writer.start();
    }
}
