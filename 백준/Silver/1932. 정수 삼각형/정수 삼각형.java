import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] triangle = new int[n][n];
        int[][] dp = new int[n][n];

        // 삼각형 값 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = sc.nextInt();
            }
        }

        // 동적 프로그래밍으로 각 위치까지의 최대 합 계산
        dp[0][0] = triangle[0][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][0] + triangle[i][0]; // 왼쪽 끝
            dp[i][i] = dp[i-1][i-1] + triangle[i][i]; // 오른쪽 끝
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
            }
        }

        // 최대 합 찾기
        int maxSum = dp[n-1][0];
        for (int i = 1; i < n; i++) {
            if (dp[n-1][i] > maxSum) {
                maxSum = dp[n-1][i];
            }
        }

        System.out.println(maxSum);
    }
}
