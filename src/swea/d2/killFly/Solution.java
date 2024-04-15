package swea.d2.killFly;

import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] board = new int[n][n];
            int max = 0;  // 각 테스트 케이스마다 초기화

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < n; k++) {
                    board[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            for (int j = 0; j <= n - m; j++) {  // 범위 조정
                for (int k = 0; k <= n - m; k++) {
                    int tempSum = 0;
                    for (int l = 0; l < m; l++) {
                        for (int o = 0; o < m; o++) {
                            tempSum += board[j + l][k + o];
                        }
                    }
                    max = Math.max(tempSum, max);  // 값을 업데이트
                }
            }
            System.out.println(max);  // 한 테스트 케이스의 결과 출력
        }
    }
}

