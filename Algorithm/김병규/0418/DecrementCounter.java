package com.example.day0418;

public class DecrementCounter implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i >= 1; i--) {
            System.out.println("Decrement: {" + i + "}");
            try {
                Thread.sleep((int) (Math.random() * 10) + 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
