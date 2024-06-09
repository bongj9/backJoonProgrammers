package BackJ.Silver.s1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] arr = new int[10];

        for (int i = 0; i < N.length(); i++) {
            int input = Character.getNumericValue(N.charAt(i));
            if (input == 6 || input == 9) {
                arr[9]++;
            } else {
                arr[input]++;
            }
        }

        // 9번과 6번이 같으므로
        // 9번의 세트를 계산
        if (arr[9] % 2 == 0) {
            arr[9] = arr[9] / 2;
        } else {
            arr[9] = arr[9] / 2 + 1;
        }

        // 배열을 정렬하고 가장 큰 값을 찾음
        Arrays.sort(arr);

        System.out.println(arr[9]);
    }
}