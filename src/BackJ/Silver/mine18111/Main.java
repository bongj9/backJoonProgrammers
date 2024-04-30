package BackJ.Silver.mine18111;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int count = 0;
        int [][] input = new int[N][M];
        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                input[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        int dif = 0;
        //1번 조건 ->2초
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (input[i][j] != input[i][j + 1]) {
                    dif = Math.abs(input[i][j] - input[i][j + 1]);
                    count++;
                }
            }
        }
        if (count < (N*B/2) && count ) {

        }else{

        }
    }
}
