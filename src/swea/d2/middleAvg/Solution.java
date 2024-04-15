package swea.d2.middleAvg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 1; i <= testCases; i++) {
            int[] inputs = new int[10];
            long sum = 0;
            long avg = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < 10; j++) {
                inputs[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(inputs);
            for (int j = 1; j < 9; j++) {
                sum += inputs[j];
            }
            avg = sum / 8;

            System.out.println("#" + i + " " + avg);
        }
    }
}
