package example.practice.day0409.orderexam;

public class PizzaOrder extends Order{
    @Override
    public void prepareFood() {
        System.out.println("피자가 준비되었습니다.");
    }

    @Override
    public void serveFood() {
        System.out.println("피자가 서빙되었습니다.");
    }
}
