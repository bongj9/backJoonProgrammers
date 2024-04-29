package swea.d2.waterValue;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        for (int i = 1; i <= testcases; i++) {
            //P, Q, R, S, W
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int A = P * W;
            if (W <= R ) {
                int B = Q;
                System.out.println("#" + i + " " + Math.min(A,B));
            } else{
                int B = Q+(W-R)*S;
                System.out.println("#" + i + " " + Math.min(A,B));
            }

        }
    }
}
