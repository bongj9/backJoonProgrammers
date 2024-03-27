package BackJ.Silver.card2_2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int tmp = 0;
        int[] input = new int[n];
        for (int i = n; i > 0; i--) {
            input[i] = i;
            if (input[i] != 1) {
                queue.add(input[i]);
            }
        }
        Queue<Integer> queue1 = new LinkedList<>();
        //상위값이 입력값과 같을때 멈춤
        while (n != queue1.peek()) {

        }
    }
}
