package BackJ.Silver.card2_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<Integer, Integer> cardCounts = new HashMap<>();
        // 받은 숫자 카드를 해시맵에 추가하면서 등장 횟수를 카운트
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            cardCounts.put(num, cardCounts.getOrDefault(num, 0) + 1);
        }

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 해당 숫자 카드가 등장한 횟수를 StringBuilder에 추가
            sb.append(cardCounts.getOrDefault(num, 0)).append(' ');
        }
        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}
