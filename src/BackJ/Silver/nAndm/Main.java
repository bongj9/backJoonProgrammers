package BackJ.Silver.nAndm;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] array = new int[n][m];
        for (int i = 0; i < n+1; i++) {
            for (int j = i+1; j < m + 1; j++) {
                array[i][j] = j
            }
        }
    }
}
