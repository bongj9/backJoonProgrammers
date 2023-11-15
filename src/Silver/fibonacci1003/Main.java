package Silver.fibonacci1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        //testCase받기
        int testCase = Integer.parseInt(line.readLine());
        //반복횟수,cnt1,cnt0값을 프린트해주기

        for (int i = 0; i < testCase; i++) {
            int cnt1 = 0;
            int cnt0 = 0;
            int input = Integer.parseInt(line.readLine());
            fibonacci(input);

            //여기서 1과0을 if문으로 나누기

        }
    }

    //피보나치 메서드 구현
    //값을 구현하는거보다 그냥 fibonacci(1),fibonacci(0)의 개수를 구하면 되는거다 
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Correct base case for n == 0
        } else if (n == 1) {
            return 1; // Correct base case for n == 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive calls
    }
}



/*    public static int fibonacci(int n) {
        if (n == 0) {
            System.out.println("0");
            return 0;
        } else if (n == 1) {
            System.out.println("1");
            return 1;
        } else {
            return fibonacci(n‐1) + fibonacci(n‐2);
        }
        //int fibonacci(int n) {
        //    if (n == 0) {
        //        printf("0");
        //        return 0;
        //    } else if (n == 1) {
        //        printf("1");
        //        return 1;
        //    } else {
        //        return fibonacci(n‐1) + fibonacci(n‐2);
        //    }
        //}
    }*//*

}

*/
/*
import java.util.Scanner;

public class Main {

    // 피보나치 수열을 계산하는 함수
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            // N이 0일 경우 특별 처리
            if (N == 0) {
                System.out.println("1 0");
            } else {
                // 0과 1이 출력되는 횟수는 각각 fibonacci(N-1)과 fibonacci(N)과 같다
                System.out.println(fibonacci(N - 1) + " " + fibonacci(N));
            }
        }

        scanner.close();
    }
}*/
