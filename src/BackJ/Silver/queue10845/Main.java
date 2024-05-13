package BackJ.Silver.queue10845;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim()," ");
            String input = st.nextToken();

            switch (input) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                break;
                case "pop":
                    System.out.println(queue.isEmpty() ? -1 : queue.poll());
                break;
                case "size":
                    System.out.println(queue.size());
                break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                break;
                case "front":
                    System.out.println(queue.isEmpty() ? -1 : queue.peekFirst());
                break;
                case "back":
                    System.out.println(queue.isEmpty() ? -1 : queue.peekLast());
                break;
            }
        }
    }
}
