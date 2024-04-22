package swea.d2.spin;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 1; i <= testcase; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] inputs = new int[n][n];
            //입력관리
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < n; k++) {
                    inputs[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            //90도 돌린값
            //출력을 줄 마다 해야한다.for문 +" "+ 이런식으로
            System.out.println("#" + i);
            for (int j = 0; j < inputs.length; j++) {
                for (int k = 0; k < inputs.length; k++) {
                    System.out.print(nineSpin(inputs)[j][k]);
                }
                System.out.print(" ");
                for (int k = 0; k < inputs.length; k++) {
                    System.out.print(halfSpin(inputs)[j][k]);
                }
                System.out.print(" ");for (int k = 0; k < inputs.length; k++) {
                    System.out.print(halfhalfSpin(inputs)[j][k]);
                }
                System.out.println();
            }
            /*StringBuilder sb = new StringBuilder();
            for (int j = 0; j < inputs.length; j++) {
                System.out.println(Arrays.toString(nineSpin(inputs)[j]) + " " + Arrays.toString(halfSpin(inputs)[j])+" "+Arrays.toString(halfhalfSpin(inputs)[j]));
            }*/
        }
    }

    private static int[][] nineSpin(int[][] inputs) {
        int n = inputs.length;
        int [][] newInputs = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newInputs[i][j] = inputs[n - j - 1][i];
            }
        }
        return newInputs;
    }
    //180도
    private static int[][] halfSpin(int[][] inputs) {
        int n = inputs.length;
        int [][] newInputs = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newInputs[i][j] = inputs[n - i - 1][n - j - 1];
            }
        }
        return newInputs;
    }
    //270도
    private static int[][] halfhalfSpin(int[][] inputs) {
        int n = inputs.length;
        int [][] newInputs = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newInputs[i][j] = inputs[j][n-1-i];
            }
        }
        return newInputs;
    }

}
