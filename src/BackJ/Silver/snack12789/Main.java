package BackJ.Silver.snack12789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int peopleCount = Integer.parseInt(br.readLine());
        int[] num = new int[peopleCount];
        Stack<Integer> stack = new Stack<>();
        int current = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < peopleCount; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            if (num[i] == current) {
                current++;
                while (!stack.isEmpty() && stack.peek() == current) {
                    stack.pop();
                    current++;
                }
            } else stack.push(num[i]);
        }
        //current를 1로 받았으니 확인할때는 -1을 해주는 것이 맞다.
        if (current - 1 == peopleCount) {
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
    }
}
