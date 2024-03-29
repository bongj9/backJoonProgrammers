package BackJ.Silver.deck2_28279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int input = Integer.parseInt(st.nextToken());
            if (input == 1) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if (input == 2) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if (input == 3) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollFirst());
                }
            } else if (input == 4) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollLast());
                }
            } else if (input == 5) {
                System.out.println(deque.size());
            } else if (input == 6) {
                if (deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (input == 7) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekFirst());
                }
            } else if (input == 8) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.peekLast());
                }
            }
        }
    }
}
