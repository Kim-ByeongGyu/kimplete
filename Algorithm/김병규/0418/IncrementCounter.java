package com.example.day0418;

public class IncrementCounter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Increment: {" + i + "}");
            try {
                Thread.sleep((int) (Math.random() * 10) + 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
