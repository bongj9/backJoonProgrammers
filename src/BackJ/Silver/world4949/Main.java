package BackJ.Silver.world4949;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (!(s = br.readLine()).equals(".")) {
            if (isBalanced(s)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // 여는 괄호를 만나면 스택에 푸시합니다.
            if (c == '(' || c == '[') {
                stack.push(c);
            }
            // 닫는 괄호를 만나면 스택에서 꺼내어 짝을 맞춥니다.
            else if (c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // 스택이 비어있다면 균형이 맞지 않습니다.
                }
                char last = stack.pop();
                // 괄호의 짝이 맞지 않는 경우
                if ((c == ')' && last != '(') || (c == ']' && last != '[')) {
                    return false;
                }
            }
        }
        // 모든 검사가 끝난 후 스택이 비어있다면 균형이 맞는 괄호 문자열입니다.
        return stack.isEmpty();
    }
}
