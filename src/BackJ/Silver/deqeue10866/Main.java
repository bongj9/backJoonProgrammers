package BackJ.Silver.deqeue10866;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            switch (input) {
                case "push_front" -> {
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "push_back" -> {
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "pop_front" -> {
                    System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());
                    break;
                }
                case "pop_back" -> {
                    System.out.println(deque.isEmpty() ? -1 : deque.pollLast());
                    break;
                }
                case "size" -> {
                    System.out.println(deque.size());
                    break;
                }
                case "empty" -> {
                    System.out.println(deque.isEmpty() ? 1 : 0);
                    break;
                }
                case "front" -> {
                    System.out.println(deque.isEmpty() ? -1 : deque.peekFirst());
                    break;
                }
                case "back" -> {
                    System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
                }
            }
        }
    }
}
