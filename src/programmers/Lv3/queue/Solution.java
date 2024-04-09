package programmers.Lv3.queue;

import java.util.PriorityQueue;
import java.util.Arrays;

class Solution {
    public int solution(int[][] jobs) {
        // 요청 시간에 따라 jobs 정렬
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        // 우선순위 큐를 사용하여 수행 시간이 짧은 작업을 우선 처리
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        int count = 0; // 처리된 작업 수
        int idx = 0; // 현재 jobs 배열의 인덱스
        int time = 0; // 현재 시간
        int answer = 0; // 모든 작업을 처리할 때까지 걸린 시간의 합

        while(count < jobs.length) {
            // 현재 시간 이전에 도착한 모든 작업을 큐에 추가
            while(idx < jobs.length && jobs[idx][0] <= time) {
                queue.add(jobs[idx]);
                idx++;
            }

            if(queue.isEmpty()) {
                // 처리할 수 있는 작업이 없다면 시간을 다음 작업의 도착 시간으로 이동
                time = jobs[idx][0];
            } else {
                // 작업 처리
                int[] job = queue.poll();
                time += job[1];
                answer += time - job[0];
                count++;
            }
        }

        return answer / jobs.length; // 평균 시간 계산하여 반환
    }
}
