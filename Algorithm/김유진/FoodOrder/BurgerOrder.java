package exam;

import java.util.Scanner;
public class BurgerOrder extends Order{
    Scanner sc = new Scanner(System.in);
    private String burger = " ";
    @Override
    public void prepareFood() {
        System.out.print("어떤 버거를 주문하시나요? >>");
        burger = sc.nextLine();
        System.out.println(burger + "버거를 준비해드리겠습니다.");
    }
    @Override
    public void serveFood() {
        System.out.println("고객님 주문하신" + burger +"버거 나왔습니다.");
    }
}
