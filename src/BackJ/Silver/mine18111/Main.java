package BackJ.Silver.mine18111;

/*import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int count = 0;
        int [][] input = new int[N][M];
        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                input[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        int dif = 0;
        //1번 조건 ->2초
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (input[i][j] != input[i][j + 1]) {
                    dif = Math.abs(input[i][j] - input[i][j + 1]);
                    count++;
                }
            }
        }
        Loop:
        if (count < (N*B/2) && count ) {

        }else{

        }
    }
}*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] input = new int[N][M];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // 입력 받으면서 최소값과 최대값 찾기
        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                input[i][j] = Integer.parseInt(st1.nextToken());
                if (input[i][j] < min) min = input[i][j];
                if (input[i][j] > max) max = input[i][j];
            }
        }

        int answerTime = Integer.MAX_VALUE;
        int answerHeight = -1;

        // 가능한 모든 높이에 대해 시도
        for (int h = min; h <= max; h++) {
            int time = 0;
            int inventory = B;  // 초기 인벤토리

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    //차이
                    int diff = input[i][j] - h;
                    if (diff > 0) {
                        // 블록 제거
                        time += Math.abs(diff) * 2;
                        inventory += Math.abs(diff);
                    } else if (diff < 0) {
                        // 블록 추가
                        time += Math.abs(diff);
                        inventory -= Math.abs(diff);
                    }
                }
            }

            // 인벤토리가 충분하다면 시간 업데이트
            if (inventory >= 0 && time <= answerTime) {
                answerTime = time;
                answerHeight = h;
            }
        }

        System.out.println(answerTime + " " + answerHeight);
    }
}
