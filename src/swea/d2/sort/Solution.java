package swea.d2.sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            int n = Integer.parseInt(br.readLine());
            int [] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            System.out.print("#"+(i+1));
            for (int i1 : arr) {
                System.out.print(" "+ i1);
            }
            System.out.println();
        }
    }
}
