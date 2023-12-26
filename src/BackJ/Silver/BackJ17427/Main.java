package BackJ.Silver.BackJ17427;

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int output = 0;
        for (int i = 1; i <= N; i++) {
            if (N%i == 0) {
                output += i;
            }
        }
        System.out.println(output);
    }
}*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long result = 0; // g(N) 값을 저장할 변수

        for (int i = 1; i <= N; i++) {
            result += f(i);
        }

        System.out.println(result); // 최종 g(N) 값을 출력
    }

    // f(A)를 계산하는 함수
    public static long f(int A) {
        long sum = 0;
        int sqrtA = (int) Math.sqrt(A);
        for (int i = 1; i <= sqrtA; i++) {
            if (A % i == 0) {
                sum += i; // i를 sum에 더함
                if (i != A / i) { // i와 A/i 가 다를 경우에만 추가
                    sum += A / i;
                }
            }
        }
        return sum;
    }
}

*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[] dp = new long[N + 1];  // dp[i]는 i의 약수의 합을 저장합니다.

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j * i <= N; j++) {
                dp[i * j] += i;
            }
        }

        long result = 0;
        for (int i = 1; i <= N; i++) {
            result += dp[i];
        }

        System.out.println(result);
    }
}



