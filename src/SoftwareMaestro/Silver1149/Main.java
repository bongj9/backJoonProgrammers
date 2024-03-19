package SoftwareMaestro.Silver1149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dp = new int[N+1][3];
        int[][] cost = new int[N+1][3];

        for (int i = 1; i <= N; i++) {
            cost[i][0] = sc.nextInt(); // 빨강
            cost[i][1] = sc.nextInt(); // 초록
            cost[i][2] = sc.nextInt(); // 파랑
        }

        for (int i = 1; i <= N; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
        }

        System.out.println(Math.min(Math.min(dp[N][0], dp[N][1]), dp[N][2]));
    }
}

