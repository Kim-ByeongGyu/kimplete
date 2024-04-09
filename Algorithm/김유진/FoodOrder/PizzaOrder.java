package exam;
import java.util.Scanner;
public class PizzaOrder extends Order{
    Scanner sc = new Scanner(System.in);
    private String pizza = " ";
    @Override
    public void prepareFood() {
        System.out.print("어떤 피자를 주문하시나요? >>");
        pizza = sc.nextLine();
        System.out.println(pizza + "피자를 준비해드리겠습니다.");
    }
    @Override
    public void serveFood() {
        System.out.println("고객님 주문하신" + pizza +"피자 나왔습니다.");
    }
}
