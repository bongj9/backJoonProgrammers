package Silver.bridge1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            String[] numbers = bf.readLine().split(" ");
            int N = Integer.parseInt(numbers[0]);
            int M = Integer.parseInt(numbers[1]);
            System.out.println(combination(N, M));
        }
    }

    public static long combination(int n, int m) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= (m - i);
            result /= (i + 1);
        }
        return result;
    }
}
/* 스택오버 플로우가 나서 조합값이 잘 안나옴 팩토리얼값이 너무 커져서 감당이 안되서 그런듯
    public static long combination(int n, int m) {
        return factorial(m) / (factorial(n)*factorial(m - n));
    }

    public static long factorial(int number) {
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }*/


