package swea.d2.sdoqu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for (int q = 0; q < testCases; q++) {
            int[][] board = new int[9][9];
            // 스도쿠 보드를 읽어옵니다.
            for (int i = 0; i < 9; i++) {
                String[] input = br.readLine().split(" ");
                for (int j = 0; j < 9; j++) {
                    board[i][j] = Integer.parseInt(input[j]);
                }
            }

            System.out.println("#" + (q + 1) + " " + (isValidSudoku(board) ? "1" : "0"));
        }
    }

    private static boolean isValidSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> column = new HashSet<>();
            Set<Integer> box = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                // 행 검사
                if (!addAndCheck(row, board[i][j])) return false;
                // 열 검사
                if (!addAndCheck(column, board[j][i])) return false;
                // 3x3 서브 그리드 검사
                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                if (!addAndCheck(box, board[rowIndex + j / 3][colIndex + j % 3])) return false;
            }

            // 각 HashSet의 크기가 9가 아니면 스도쿠 보드가 유효하지 않습니다.
            if (row.size() != 9 || column.size() != 9 || box.size() != 9) {
                return false;
            }
        }

        return true;
    }

    private static boolean addAndCheck(Set<Integer> set, int number) {
        // 숫자가 유효하지 않거나 HashSet에 추가할 때 크기가 변경되지 않으면 false를 반환합니다.
        if (number < 1 || number > 9 || !set.add(number)) {
            return false;
        }
        return true;
    }
}

