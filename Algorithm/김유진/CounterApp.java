package day13;

// 숫자 1~100까지 증가시키는 스레드
class IncrementCounter implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<101; i++){
            System.out.printf("Increment: {%d}\n", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
// 숫자 100->1 까지 감소 시키는 스레드
class DecrementCounter implements Runnable{
    @Override
    public void run() {
        for(int i = 100; i>-1; i--){
            System.out.printf("Decrement: {%d}\n", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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