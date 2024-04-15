package swea.d2.killFly;

import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int t = 1; t <= testcase; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] board = new int[n][n];
            int max = 0;

            // 보드의 값 받기
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < n; k++) {
                    board[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            // MxM 크기의 부분 배열의 최대 파리 수 계산
            for (int j = 0; j <= n - m; j++) {
                for (int k = 0; k <= n - m; k++) {
                    int tempSum = 0;
                    for (int a = 0; a < m; a++) {
                        for (int b = 0; b < m; b++) {
                            tempSum += board[j + a][k + b];
                        }
                    }
                    max = Math.max(tempSum, max);
                }
            }

            // 결과 출력
            System.out.println("#" + t + " " + max);
        }
    }
}
/*
누적합으로 풀었을때
import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int t = 1; t <= testcase; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] A = new int[n+1][n+1];
            int[][] S = new int[n+1][n+1];

            for (int j = 1; j <= n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 1; k <= n; k++) {
                    A[j][k] = Integer.parseInt(st.nextToken());
                    S[j][k] = A[j][k] + S[j-1][k] + S[j][k-1] - S[j-1][k-1];
                }
            }

            int max = 0;
            for (int j = 1; j <= n - m + 1; j++) {
                for (int k = 1; k <= n - m + 1; k++) {
                    int r1 = j, c1 = k;
                    int r2 = j + m - 1, c2 = k + m - 1;
                    int sum = S[r2][c2] - S[r1-1][c2] - S[r2][c1-1] + S[r1-1][c1-1];
                    max = Math.max(sum, max);
                }
            }

            System.out.println("#" + t + " " + max);
        }
    }
}

 */
