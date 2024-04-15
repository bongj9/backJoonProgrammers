package swea.d2.zigzag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 1; i <= testcase; i++) {
            int n = Integer.parseInt(br.readLine());
            int k = 0;
            for (int j = 1; j <= n; j++) {
                //짝수
                if (j % 2 == 1) {
                    k += j;
                }//홀수
                else k -= j;
            }
            System.out.println("#" + i + " " + k);
        }
    }
}
