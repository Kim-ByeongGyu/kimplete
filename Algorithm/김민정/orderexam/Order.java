package example.practice.day0409.orderexam;

public abstract class Order {
    public abstract void prepareFood();
    public abstract void serveFood();
    public final void completeOrder(){
        prepareFood();
        serveFood();
        System.out.println("주문이 완료되었습니다!");
    }
}
