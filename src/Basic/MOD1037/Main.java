package Basic.MOD1037;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n]; //입력받을 숫자만큼의 배열을 생성
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }//n만큼의 숫자를 입력받는 방법
        scanner.close();
        for (int num : arr) {
            if (num < max) {
                max = num;
            }
            if (num > min) {
                min = num;
            }
        }
        System.out.println(max * min);

    }
}
