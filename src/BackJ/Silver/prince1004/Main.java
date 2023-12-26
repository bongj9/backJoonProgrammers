package BackJ.Silver.prince1004;

// 기타 필요한 import문

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.awt.geom.Point2D.distance;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < testcase; i++) {
            String[] input = br.readLine().split(" "); // 공백으로 분리
            int x1_start = Integer.parseInt(input[0]);
            int y1_start = Integer.parseInt(input[1]);
            int x2_end = Integer.parseInt(input[2]);
            int y2_end = Integer.parseInt(input[3]);
            int cnt = 0;
            int planetCnt = Integer.parseInt(br.readLine());

            for (int j = 0; j < planetCnt; j++) {
                String[] input2 = br.readLine().split(" "); // 공백으로 분리
                int x1_p = Integer.parseInt(input2[0]);
                int y1_p = Integer.parseInt(input2[1]);
                int r1_p = Integer.parseInt(input2[2]);

                // 시작점과 끝점이 각각 행성 시스템 내부에 있는지 확인
                boolean startInside = distance(x1_start, y1_start, x1_p, y1_p) < r1_p;
                boolean endInside = distance(x2_end, y2_end, x1_p, y1_p) < r1_p;

                // 시작점과 끝점 중 하나만 내부에 있는 경우에만 cnt 증가
                if (startInside != endInside) {
                    cnt++;
                }
            }
            System.out.println(cnt); // 여기로 이동
        }
    }

    // distance 메소드는 그대로 유지
}


