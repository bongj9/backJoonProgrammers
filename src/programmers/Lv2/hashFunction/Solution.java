package programmers.Lv2.hashFunction;

import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;

        // 배열 정렬
        Arrays.sort(data, (o1, o2) -> {
            if(o1[col - 1] != o2[col - 1]) {
                return o1[col - 1] - o2[col - 1];
            } else {
                return o2[0] - o1[0];
            }
        });

        // 나머지 합 구하기
        List<Integer> list = new ArrayList<>();
        for (int i = row_begin - 1; i <= row_end - 1; i++) {
            int temp = 0;
            for (int j = 0; j < data[i].length; j++) {
                temp += data[i][j] % (i + 1);
            }
            list.add(temp);
        }

        // XOR 연산
        for (int i : list) {
            answer ^= i;
        }

        return answer;
    }
}