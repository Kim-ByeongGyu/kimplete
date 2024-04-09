package example.practice.day0409.orderexam;

public class BurgerOrder extends Order{
    @Override
    public void prepareFood() {
        System.out.println("버거가 준비되었습니다.");
    }

    @Override
    public void serveFood() {
        System.out.println("버거가 서빙되었습니다.");
    }
}
