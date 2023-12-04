package Bronze.plus2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        int[][] X = new int[N][M];

        // 행렬 X 입력 받기ㅇ
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                X[i][j] = Integer.parseInt(input[j]);
            }
        }

        // 행렬 Y를 입력받아 바로 X에 더하기
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                X[i][j] += Integer.parseInt(input[j]);
            }
        }

        // 결과 출력을 위한 StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(X[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}

