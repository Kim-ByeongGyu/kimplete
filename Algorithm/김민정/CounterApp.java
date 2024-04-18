package example.practice.day0418;

import java.util.Random;

class IncrementCounter implements Runnable{
    Random rand = new Random();
    @Override
    public void run() {
        for(int i = 1; i <= 100; i++){
            int time = rand.nextInt(0,11);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Increment: " + i);
        }
    }
}
class DecrementCounter implements Runnable{
    Random rand = new Random();
    @Override
    public void run() {
        for(int i = 100; i > 0; i--){
            int time = rand.nextInt(0,11);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Decrement: " + i);
        }
    }
}
public class CounterApp {
    public static void main(String[] args) {
        Thread incrementThread = new Thread(new IncrementCounter());
        Thread decrementThread = new Thread(new DecrementCounter());

        incrementThread.start();
        decrementThread.start();
    }
}
