package swea.d2.triangle;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];
            arr[0][0] = 1;
            for (int i = 1; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                    }
                }
            }
            System.out.printf("#%d \n", tc);
            for (int[] x : arr) {
                StringBuilder sb = new StringBuilder();
                for (int i : x) {
                    if (i != 0) {
                        sb.append(i).append(" ");
                    }
                }
                if (sb.length() > 0) sb.setLength(sb.length() - 1); // 마지막 공백 제거
                System.out.println(sb.toString());
            }
        }
    }
}
