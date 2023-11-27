package Silver.Ertos2960;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" "); // 공백으로 구분된 입력 처리
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        ertos(N, K);
    }

    public static void ertos(int n, int k) {
        boolean[] isRemoved = new boolean[n + 1]; // 제거 여부를 추적하는 배열
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            if (isRemoved[i]) continue; // 이미 제거된 숫자는 건너뜀

            for (int j = i; j <= n; j += i) {
                if (!isRemoved[j]) {
                    isRemoved[j] = true; // 숫자를 제거하고 제거 플래그를 설정
                    cnt++;

                    if (cnt == k) {
                        System.out.println(j); // k번째로 제거된 숫자를 출력
                        return;
                    }
                }
            }
        }
    }
}
