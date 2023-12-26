package programmers.Lv2.Snail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int[][] triangle = new int[testcase][testcase];
        int v = 1;
        int x = 0;
        int y = 0;
        while (true) {
            //아래로 이동
            while (true) {
                triangle[y][x] = v++;
                if (y + 1 == testcase || triangle[y + 1][x] != 0) break;
                    y += 1;
            }
            if (x + 1 == testcase || triangle[y][x + 1] != 0) break;
                x += 1;
                //오른쪽으로 이동
             while (true) {
                 triangle[y][x] = v++;
                 if (x + 1 == testcase || triangle[y][x + 1] != 0) break;
                 x += 1;
             }
            if (triangle[y - 1][x - 1] != 0) break;
            x -= 1;
            y -= 1;
            //위로 이동
            while (true) {
                triangle[y][x] = v++;
                if (triangle[y - 1][x - 1] != 0) {
                    break;
                }
                x -= 1;
                y -= 1;
            }
            if(y+1 == testcase || triangle[y+1][x] != 0) break;
            y += 1;
        }
        //
        int [] result = new int[v - 1];
        int index = 0;
        for (int i = 0; i < testcase; i++) {
            for (int j = 0; j <= i; j++) {
                result[index++] = triangle[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
