package exam;
import java.util.Scanner;
public class FoodTest {
    public static void main(String[] args) {
        //Order: 추상 메소드 -> 상속 : PizzaOrder , BurgerOrder
        //Payment : 인터페이스 -> 구현 : CreditPayment, CashPayment
        Payment card = new CreditPayment();
        Payment cash = new CashPayment();
        PizzaOrder pizza = new PizzaOrder();
        BurgerOrder burger = new BurgerOrder();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("\'환상의 피자와 버거의 나라\' 음식점에 오신걸 환영합니다.");
        System.out.print("원하시는 메뉴의 번호를 입력해주세요.(1. 피자 \t2. 햄버거) ");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("피자를 선택하셨습니다.");
                pizza.completeOrder();
                break;
            case 2:
                System.out.println("햄버거를 선택하셨습니다.");
                burger.completeOrder();
                break;
        }
        System.out.print("결제 도와드리겠습니다.\n원하시는 결제 방법을 선택해주세요.(1. 카드 \t2. 현금) ");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("카드 결제를 선택하셨습니다.");
                card.processPayment();
                break;
            case 2:
                System.out.println("현금 결제를 선택하셨습니다.");
                cash.processPayment();
                break;
        }


    }
}
