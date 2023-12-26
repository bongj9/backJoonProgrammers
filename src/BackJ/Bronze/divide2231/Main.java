package BackJ.Bronze.divide2231;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        System.out.println(findConstructor(test));
    }

    public static int findConstructor(int N) {
        for (int i = 1; i < N; i++) {
            int sum = i;
            int current = i;

            // 각 자리수를 더하는 부분
            while (current > 0) {
                sum += current % 10; // 현재 자리수 더하기
                current /= 10; // 다음 자리수로 이동
            }

            // 분해합이 N과 같은 경우
            if (sum == N) {
                return i; // 생성자 반환
            }
        }
        return 0; // 생성자가 없는 경우
    }
}

