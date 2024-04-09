package exam;

public abstract class Order {
    //음식 주문과 관련된 공통적인 특성과 메솓 구현
    public abstract void prepareFood();
    public abstract void serveFood();
    public final void completeOrder() {
        prepareFood();
        System.out.println("주문이 완료되었습니다!");
        serveFood();
    }
}
