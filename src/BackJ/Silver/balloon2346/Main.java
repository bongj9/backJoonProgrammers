package BackJ.Silver.balloon2346;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static  Deque<Integer> deque = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        //덱에 넣기
        for (int i = 0; i <= testCase; i++) {
            deque.add(Integer.parseInt(st.nextToken()));
        }
        int index = 0;
        for (int i = 0; i < testCase; i++) {
            //해당인덱스에 값을 제거하고 반환
            int move = ((LinkedList<Integer>) deque).remove(index);
            sb.append((index + 1) + " ");

            if(deque.isEmpty()) break;
            if (move < 0) { //오른쪽으로 이동
                //인덱스 범위 안넘어가게 나머지값을 반환
                index = (index + move - 1) % deque.size();
            } else { //왼쪽으로이동
                index = (index + move) % deque.size(); // 음수인 경우도 올바르게 처리
                if (index < 0) index += deque.size(); // 인덱스가 음수이면 큐의 크기를 더해줌
            }

        }
        //문자열로 반환
        System.out.println(sb.toString());



    }
    //양수면 오른쪽으로 이동 음수면 왼쪽으로 이동
    public static int moveIndex(int index) {
        if (index < 0) {
            deque.
        }
    }
}
