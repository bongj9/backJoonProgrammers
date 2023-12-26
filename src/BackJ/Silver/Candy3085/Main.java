package Silver.Candy3085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new char[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 오른쪽과 교환
                if (j + 1 < N) {
                    swap(i, j, i, j + 1);
                    answer = Math.max(answer, check());
                    swap(i, j, i, j + 1); // 원상 복구
                }
                // 아래쪽과 교환
                if (i + 1 < N) {
                    swap(i, j, i + 1, j);
                    answer = Math.max(answer, check());
                    swap(i, j, i + 1, j); // 원상 복구
                }
            }
        }

        System.out.println(answer);
    }

    static void swap(int x1, int y1, int x2, int y2) {
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    static int check() {
        int max = 0;
        for (int i = 0; i < N; i++) {
            int count = 1;
            // 행 검사
            for (int j = 1; j < N; j++) {
                if (board[i][j] == board[i][j - 1]) count++;
                else count = 1;
                max = Math.max(max, count);
            }
            count = 1;
            // 열 검사
            for (int j = 1; j < N; j++) {
                if (board[j][i] == board[j - 1][i]) count++;
                else count = 1;
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
