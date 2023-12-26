package Silver.turret1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(line.readLine()); //테스트 케이스 개수

        //testCaseCount의 반복 프로그램
        for (int i = 0; i < testCaseCount; i++) {
            //이렇게 입력받는 값을 좀간단하게 받을수있는지?
            StringTokenizer st = new StringTokenizer(line.readLine());
            //매번 새로운 값을 받아야하기때문에  for문에 넣어줘야한다
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            //류재열의 좌표을 임의의로 만든거
            System.out.println(findMarinePositions(x1, y1, r1, x2, y2, r2));

            //if문으로 무한대 처리하기 무한대면 -1출력
        }
    }
    //거리를 구하는 메서드
/*
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
*/
    private static int findMarinePositions(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distanceSquared = (int) Math.pow((x2 - x1), 2) + (int) Math.pow((y2 - y1), 2);
        // 두 원이 동일한 경우 (무한대 위치)
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
        // 두 원이 서로 겹치지 않는 경우
        if (distanceSquared > (r1 + r2) * (r1 + r2) || distanceSquared < (r1 - r2) * (r1 - r2)) {
            return 0;
        }
        // 두 원이 서로 한 점에서 만나는 경우
        if (distanceSquared == (r1 + r2) * (r1 + r2) || distanceSquared == (r1 - r2) * (r1 - r2)) {
            return 1;
        }
        // 그 외 경우 (두 점에서 만나는 경우)
        return 2;
    }
}
/*
느낀점 StringTokenizer를 활용해봤다
문제이해가 너무 힘들었다.문제와 변수와 결과값을 보고 어떻게 두원과의 교점구하는지 알지?
그리고 두원의 교점구하는 알리즘이 너무 어려웠다

*/


