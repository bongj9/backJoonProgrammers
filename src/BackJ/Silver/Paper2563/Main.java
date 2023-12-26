package Silver.Paper2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        Boolean[][] grid = new Boolean[100][100];
        int overlappedArea = 0;
        for (int i = 0; i < testcase; i++) {
            String[] input = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);

            // 겹치는 부분 확인하며 영역 표시
            for (int x = X; x < X + 10; x++) {
                for (int y = Y; y < Y + 10; y++) {
                    if (grid[x][y]) {
                        overlappedArea++; // 겹치는 부분 면적 증가
                    } else {
                        grid[x][y] = true; // 처음 차지하는 영역 표시
                    }
                }
            }
        }


        //총량 공식
        int result = 100 * testcase -overlappedArea; // -겹친부분
        System.out.println(result);

    }
}
