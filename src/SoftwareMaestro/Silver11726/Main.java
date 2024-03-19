package SoftwareMaestro.Silver11726;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // 배열 크기를 t+1로 설정하여 인덱스 에러를 방지
        int[] dp = new int[t+1];
        // 초기값 설정
        dp[1] = 1;
        // t가 1일 경우를 대비하여 t가 2 이상일 때만 dp[2]에 값을 할당
        if (t > 1) {
            dp[2] = 2;
        }
        // 점화식을 이용한 동적 프로그래밍 구현, 결과값을 10007로 나눈 나머지를 저장
        for (int i = 3; i <= t; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
        }
        // 최종 결과 출력, t가 1인 경우에도 정상 작동
        System.out.println(dp[t]);
    }
}

