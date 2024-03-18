package BackJ.Silver.selectRoom1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int meeting = Integer.parseInt(br.readLine()); // 회의의 수 입력 받기
        int[][] mt = new int[meeting][2]; // 2차원 배열 선언: 각 회의의 시작 시간과 종료 시간 저장
        int count = 0;
        //배열을 짤라놨다 2개씩 묶어서
        for (int i = 0; i < meeting; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 한 줄씩 읽어서 공백으로 분리
            mt[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            mt[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
        }
       //값을 1번 인덱스로 정렬
        Arrays.sort(mt, new Comparator<int[]>() {
            //<int[]>() 제네릭
            @Override
            public int compare(int[] o1, int[] o2) { //o1에는 첫번째 행 ,o2에는 두번째 행

                // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });
        int prev_end_time = 0;
        for (int i = 0; i < meeting; i++) {
            if (prev_end_time <= mt[i][0]) {
                prev_end_time = mt[i][1];
                count++;
            }
        }
        System.out.println(count);
        }
    }
