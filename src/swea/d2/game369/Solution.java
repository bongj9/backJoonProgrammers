package swea.d2.game369;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 입력 받은 숫자 n

        // 숫자를 순회하면서 3, 6, 9 게임의 규칙에 따라 출력
        for (int i = 1; i <= n; i++) {
            String numStr = String.valueOf(i);
            int count = 0; // 숫자 내 3, 6, 9의 개수를 세기 위한 변수

            // 숫자 내의 각 자리수가 3, 6, 9인지 검사
            for (char ch : numStr.toCharArray()) {
                if (ch == '3' || ch == '6' || ch == '9') {
                    count++;
                }
            }

            if (count == 0) {
                // 3, 6, 9가 한 번도 나타나지 않는 경우, 숫자를 그대로 출력
                System.out.print(i + " ");
            } else {
                // 3, 6, 9가 포함된 경우, "-"를 그 개수만큼 출력
                for (int j = 0; j < count; j++) {
                    System.out.print("-");
                }
                System.out.print(" "); // 숫자(혹은 "-") 사이의 구분을 위한 공백 추가
            }
        }
    }
}
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 입력 받은 숫자 n

        // 숫자를 순회하면서 3, 6, 9 게임의 규칙에 따라 출력
        for (int i = 1; i <= n; i++) {
            String numStr = String.valueOf(i);
            int count = 0; // 숫자 내 3, 6, 9의 개수를 세기 위한 변수

            // 숫자 내의 각 자리수가 3, 6, 9인지 검사
            for (char ch : numStr.toCharArray()) {
                if (ch == '3' || ch == '6' || ch == '9') {
                    count++;
                }
            }

            if (count == 0) {
                // 3, 6, 9가 한 번도 나타나지 않는 경우, 숫자를 그대로 출력
                System.out.print(i + " ");
            } else {
                // 3, 6, 9가 포함된 경우, "-"를 그 개수만큼 출력
                for (int j = 0; j < count; j++) {
                    System.out.print("-");
                }
                System.out.print(" "); // 숫자(혹은 "-") 사이의 구분을 위한 공백 추가
            }
        }
    }
}

 */

