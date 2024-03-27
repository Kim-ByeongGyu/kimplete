//https://www.acmicpc.net/problem/1920
import java.util.Arrays;
import java.util.Scanner;

public class FindExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr); // 배열을 정렬.

        int m = scanner.nextInt(); 
        for (int i = 0; i < m; i++) {
            int target = scanner.nextInt();
            // 이진 탐색을 통해 target이 배열 arr에 존재하는지 확인.
            int result = binarySearch(arr, target);
            System.out.println(result);
        }
    }

    // 이진 탐색
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return 1; // 존재한다면 1 반환
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0; // 존재하지 않는다면 0 반환
    }
}
