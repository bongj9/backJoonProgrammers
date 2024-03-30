package BackJ.Silver.balloon2346;

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static Deque<Integer> deque = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        //덱에 넣기
        for (int i = 1; i <= testCase; i++) {
            deque.add(Integer.parseInt(st.nextToken()));
        }
        int index = 0;
        for (int i = 0; i < testCase; i++) {
            //해당인덱스에 값을 제거하고 반환
            int move = ((LinkedList<Integer>) deque).remove(index);
            sb.append((index + 1) + " ");
            if (deque.isEmpty()) break;
            if (move > 0) { //오른쪽으로 이동
                //인덱스 범위 안넘어가게 나머지값을 반환
                index = (index + move -1) % deque.size();
            } else { //왼쪽으로이동
                index = (index + move) % deque.size(); // 음수인 경우도 올바르게 처리
                if (index < 0)
                    index += deque.size(); // 인덱스가 음수이면 큐의 크기를 더해줌
            }

        }
        //문자열로 반환
        System.out.println(sb.toString());
    }
}
*/
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Deque<Pair> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(new Pair(i, Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            Pair current = deque.pollFirst(); // 현재 풍선 제거
            sb.append(current.index).append(' '); // 제거된 풍선의 인덱스 기록

            if (deque.isEmpty()) {
                break;
            }

            int steps = current.value;
            if (steps > 0) {
                // 양수인 경우, 오른쪽으로 이동 (steps-1)만큼 반복
                for (int i = 0; i < steps - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                // 음수인 경우, 왼쪽으로 이동 (절대값으로 변환 후) 반복
                for (int i = 0; i < Math.abs(steps); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb.toString());
    }

    static class Pair {
        int index; // 풍선의 인덱스
        int value; // 풍선 안의 숫자

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] numbers = new int[N]; // 풍선 안의 숫자를 저장하는 배열
        LinkedList<Integer> indexDeque = new LinkedList<>(); // 풍선의 인덱스를 저장하는 덱
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            indexDeque.add(i);
        }

        StringBuilder sb = new StringBuilder();
        int currentIndex = 0; // 현재 풍선의 인덱스
        for (int i = 0; i < N; i++) {
            int index = indexDeque.remove(currentIndex);
            sb.append(index + 1).append(" ");
            if (indexDeque.isEmpty()) break;

            int move = numbers[index];
            if (move > 0) {
                currentIndex = (currentIndex + move - 1) % indexDeque.size();
            } else {
                currentIndex = (currentIndex + move) % indexDeque.size();
                if (currentIndex < 0) currentIndex += indexDeque.size();
            }
        }

        System.out.println(sb.toString());
    }
}
