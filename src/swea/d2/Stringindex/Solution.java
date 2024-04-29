package swea.d2.Stringindex;

import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] a = new int[N];
            int[] b = new int[M];

            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                a[j] = Integer.parseInt(st1.nextToken());
            }
            for (int j = 0; j < M; j++) {
                b[j] = Integer.parseInt(st2.nextToken());
            }

            // 최대 곱의 합을 구하기
            int maxSum = Integer.MIN_VALUE;

            // a를 기준으로 b를 이동시키며 곱의 합을 계산
            if (N <= M) {
                for (int start = 0; start <= M - N; start++) {
                    int sum = 0;
                    for (int j = 0; j; j++) {
                        sum += a[j] * b[start + j];
                    }
                    maxSum = Math.max(maxSum, sum);
                }
            } else { // b를 기준으로 a를 이동시키며 곱의 합을 계산
                for (int start = 0; start <= N - M; start++) {
                    int sum = 0;
                    for (int j = 0; j < M; j++) {
                        sum += b[j] * a[start + j];
                    }
                    maxSum = Math.max(maxSum, sum);
                }
            }

            // 결과 출력
            System.out.println("#" + (i+1) + " " + maxSum);
        }
    }
}

