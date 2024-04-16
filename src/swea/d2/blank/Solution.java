package swea.d2.blank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] matrix = new int[n][n];
            int validCount = 0;

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int l = 0; l < n; l++) {
                    matrix[j][l] = Integer.parseInt(st.nextToken());
                }
            }

            // 가로줄 확인
            for (int row = 0; row < n; row++) {
                validCount += countValidKLength(matrix[row], k);
            }

            // 세로줄 확인
            for (int col = 0; col < n; col++) {
                int[] column = new int[n];
                for (int row = 0; row < n; row++) {
                    column[row] = matrix[row][col];
                }
                validCount += countValidKLength(column, k);
            }

            System.out.println("Case #" + (i + 1) + ": " + validCount);
        }
    }

    private static int countValidKLength(int[] line, int k) {
        int count = 0, validCount = 0;
        for (int j = 0; j < line.length; j++) {
            if (line[j] == 1) {
                count++;
            } else {
                if (count == k) validCount++;
                count = 0;
            }
        }
        if (count == k) validCount++;  // 마지막에서 끝나는 경우도 확인
        return validCount;
    }
}