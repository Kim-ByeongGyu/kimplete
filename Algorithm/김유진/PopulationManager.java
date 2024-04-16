package day11;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationManager {
    private static final int EXIT = 0;
    private static final int ADD_OR_UPDATE = 1;
    private static final int REMOVE = 2;
    private static final int DISPLAY = 3;
    private static final int DISPLAY_ALL = 4;

    Map<String, Integer> map = new HashMap<>();

    // 도시 추가 또는 인구 수정
    public void addOrUpdateCity(String city, int population) {
        map.put(city, population);
    }

    // 도시 삭제
    public void removeCity(String city) {
        if (map.containsKey(city)) {
            map.remove(city);
            System.out.println(city + "의 인구 정보가 삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 도시입니다.");
        }
    }

    // 해당 도시 인구 정보 조회
    public void displayPopulation(String city) {
        if (map.containsKey(city)) {
            System.out.println(city + "의 인구는 " + map.get(city) + "명 입니다.");
        } else {
            System.out.println("존재하지 않는 도시입니다.");
        }
    }

    // 전체 도시 인구 정보 출력
    public void displayAll() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PopulationManager manager = new PopulationManager();
        Scanner scanner = new Scanner(System.in);

        manager.addOrUpdateCity("서울", 10000000);
        manager.addOrUpdateCity("부산", 3500000);

        while (true) {
            System.out.println("명령을 입력하세요 (1: 추가/수정, 2: 삭제, 3: 조회, 4: 전체 조회, 0: 종료): ");
            int command = scanner.nextInt(); // 사용자가 명령을 숫자로 입력
            if (command == EXIT) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String city;
            switch (command) {
                case ADD_OR_UPDATE:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    System.out.print("인구를 입력하세요: ");
                    int population = scanner.nextInt();
                    manager.addOrUpdateCity(city, population);
                    break;
                case REMOVE:
                    System.out.print("삭제할 도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.removeCity(city);
                    break;
                case DISPLAY:
                    System.out.print("조회할 도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.displayPopulation(city);
                    break;
                case DISPLAY_ALL:
                    manager.displayAll();
                    break;
                default:
                    System.out.println("알 수 없는 명령입니다.");
            }
        }
        scanner.close();
    }
}
