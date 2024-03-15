package BackJ.Silver.coordinate18870;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] original = new int[N];
        Integer[] sorted = new Integer[N];
        HashMap<Integer, Integer> ranking = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(st.nextToken());
            sorted[i] = original[i];
        }

        Arrays.sort(sorted);

        int rank = 0;
        for (int i = 0; i < N; i++) {
            if (!ranking.containsKey(sorted[i])) { //key값에 정렬된 입력값이 있으면
                ranking.put(sorted[i], rank++);  //정렬된 값을 꺼내고 랭크를 증가
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ranking.get(original[i])).append(' ');
        }
        System.out.println(sb);
    }
}
