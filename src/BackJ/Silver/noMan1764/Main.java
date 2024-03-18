package BackJ.Silver.noMan1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력값을 받고 n,m으로 파싱해주기
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Set<String> heard = new HashSet<>();
        for (int i = 0; i < n; i++) {
            heard.add(br.readLine());
        }

        Set<String> seenAndHeard = new HashSet<>();
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (heard.contains(name)) {
                seenAndHeard.add(name);
            }
        }

        // 배열로 변환하고 사전 순으로 정렬
        String[] result = seenAndHeard.toArray(new String[0]);
        Arrays.sort(result);

        System.out.println(seenAndHeard.size());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
