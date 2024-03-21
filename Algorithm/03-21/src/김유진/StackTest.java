//https://www.acmicpc.net/problem/28278
import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        Stack stack = new Stack(N); // 스택 객체 생성

        for (int i = 0; i < N; i++) {
            String[] command = scanner.nextLine().split(" ");
            int type = Integer.parseInt(command[0]);

            switch (type) {
                case 1:
                    int num = Integer.parseInt(command[1]);
                    stack.push(num); // 정수를 스택에 추가하는 명령
                    break;
                case 2:
                    System.out.println(stack.pop()); // 스택에서 정수를 꺼내는 명령
                    break;
                case 3:
                    System.out.println(stack.size()); // 스택에 들어있는 정수의 개수 출력 명령
                    break;
                case 4:
                    System.out.println(stack.isEmpty() ? 1 : 0); // 스택이 비어있는지 여부를 출력하는 명령
                    break;
                case 5:
                    System.out.println(stack.peek()); // 스택의 맨 위에 있는 정수를 출력하는 명령
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}
class Stack {
    private int maxSize; // 스택의 최대 크기
    private int[] stackArray; // 정수를 저장하는 배열
    private int top; // 스택의 맨 위를 가리키는 포인터

    public Stack(int size) {
        maxSize = size; // 스택의 최대 크기 설정
        stackArray = new int[maxSize]; // 배열 초기화
        top = -1; // 스택 초기화
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value; // 스택에 정수를 추가하는 메서드
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--]; // 스택에서 정수를 꺼내는 메서드
        }
        return -1;
    }

    public int size() {
        return top + 1; // 스택에 들어있는 정수의 개수를 반환하는 메서드
    }

    public boolean isEmpty() {
        return (top == -1); // 스택이 비어있는지 확인하는 메서드
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top]; // 스택의 맨 위에 있는 정수를 반환하는 메서드
        }
        return -1;
    }
}