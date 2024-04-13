package BackJ.Gold.star2447;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        printPattern(N);
    }

    public static void printPattern(int N) {
        // 패턴을 담을 Array 생성
        char[][] pattern = new char[N][N];
        // Array에 공백으로 모두 채워 초기화
        for (char[] row : pattern) {
            Arrays.fill(row, ' ');
        }

        // 패턴 메서드 실생
        drawPattern(pattern, 0, 0, N);

        // pattern 저장된 Array 출력
        for (char[] row : pattern) {
            System.out.println(row);
        }
    }

    // 패턴을 그리는 재귀적 메서드
    public static void drawPattern(char[][] pattern, int row, int col, int size) {
        if (size == 1) {
            // base case
            // 재귀의 마지막단인 size가 1이면 "*"로 채움
            pattern[row][col] = '*';
        } else {
            // recursive case
            // 재귀적으로 패턴 지정
            int newSize = size / 3;

            // 왼쪽 상단
            drawPattern(pattern, row, col, newSize);
            // 가운데 상단
            drawPattern(pattern, row, col + newSize, newSize);
            // 오르쪽 상단
            drawPattern(pattern, row, col + newSize * 2, newSize);

            // 왼쪽 중간
            drawPattern(pattern, row + newSize, col, newSize);
            // 오른쪽 중간
            drawPattern(pattern, row + newSize, col + newSize * 2, newSize);

            // 왼쪽 하단
            drawPattern(pattern, row + newSize * 2, col, newSize);
            // 가운데 하단
            drawPattern(pattern, row + newSize * 2, col + newSize, newSize);
            // 오른쪽 하단
            drawPattern(pattern, row + newSize * 2, col + newSize * 2, newSize);
        }
    }

}