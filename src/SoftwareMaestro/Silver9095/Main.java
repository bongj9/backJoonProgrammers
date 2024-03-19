package SoftwareMaestro.Silver9095;

import java.io.*;

public class Main {
    static int[] dp = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        //점화식
        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i-1];
        }
        //입력받기
        for (int j = 0; j < t; j++) {
            int test = Integer.parseInt(br.readLine());
            System.out.println(dp[test]);
        }
        br.close();
    }
}
