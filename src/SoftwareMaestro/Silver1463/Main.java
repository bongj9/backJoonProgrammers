package SoftwareMaestro.Silver1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 입력 숫자를 읽습니다
        int[] dp = new int[n + 1]; // 각 숫자에 대한 최소 단계를 저장하기 위한 다이나믹 프로그래밍 테이블


        // DP 테이블 초기화
        for (int i = 2; i <= n; i++) {
            // 항상 1을 뺄 수 있음
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 2로 나누어 떨어지면 현재와 i/2 + 1 중 최소 단계를 선택
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 3으로 나누어 떨어지면 현재와 i/3 + 1 중 최소 단계를 선택
            }
        }

        System.out.println(dp[n]); // n을 1로 줄이기 위해 필요한 최소 단계를 출력
    }
}
