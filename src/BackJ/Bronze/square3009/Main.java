package BackJ.Bronze.square3009;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       /* int[][] square = new int[3][2];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            square[i][0] = Integer.parseInt(st.nextToken());
            square[i][1] = Integer.parseInt(st.nextToken());
        }

        int x, y;
        // x 좌표 찾기
        if (square[0][0] == square[1][0]) {
            x = square[2][0];
        } else if (square[0][0] == square[2][0]) {
            x = square[1][0];
        } else {
            x = square[0][0];
        }

        // y 좌표 찾기
        if (square[0][1] == square[1][1]) {
            y = square[2][1];
        } else if (square[0][1] == square[2][1]) {
            y = square[1][1];
        } else {
            y = square[0][1];
        }

        System.out.println(x + " " + y);
    }
*/
        //xor연산을 사용하면 조오오온나 간단하다..
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        x[3] = x[0] ^ x[1] ^ x[2];
        y[3] = y[0] ^ y[1] ^ y[2];
        System.out.print(x[3]);
        System.out.print(y[3]);
    }
}