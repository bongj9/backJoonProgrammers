package BackJ.Silver.printQueue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcases; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            Queue<int[]> q = new LinkedList<>();
            Map<Integer, Integer> importanceCount = new HashMap<>();

            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int value = Integer.parseInt(st1.nextToken());
                q.offer(new int[]{value, j});  // 중요도와 초기 인덱스 저장
                importanceCount.put(value, importanceCount.getOrDefault(value, 0) + 1);
            }

            List<Integer> sortedImportances = new ArrayList<>(importanceCount.keySet());
            Collections.sort(sortedImportances, Collections.reverseOrder());  // 중요도 내림차순 정렬

            int printCount = 0;
            while (!q.isEmpty()) {
                int[] current = q.poll();
                if (current[0] == sortedImportances.get(0)) {  // 현재 문서의 중요도가 가장 높은 경우
                    printCount++;  // 인쇄 횟수 증가
                    int remaining = importanceCount.get(current[0]) - 1;
                    importanceCount.put(current[0], remaining);

                    if (remaining == 0) {  // 해당 중요도를 가진 문서가 더 이상 없으면
                        sortedImportances.remove(0);  // 리스트에서 제거
                    }

                    if (current[1] == m) {  // 찾고자 하는 문서가 인쇄된 경우
                        System.out.println(printCount);
                        break;
                    }
                } else {
                    q.offer(current);  // 중요도가 가장 높지 않다면 큐의 끝으로 다시 추가
                }
            }
        }
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcases; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            Queue<Integer> q = new LinkedList<>();
            Integer [] input = new Integer[n];
            int count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                input[j] = Integer.parseInt(st.nextToken());
                map.put(j, input[j]);
            }
            Arrays.sort(input, (a, b) -> b - a);
            for (Integer integer : input) {
                q.offer(integer);
            }
            while(!q.isEmpty()) {
                if (q.poll() != map.get(m)) {
                    count++;
                }
                System.out.println(count);
            }}
        br.close();
        }

    }
*/


