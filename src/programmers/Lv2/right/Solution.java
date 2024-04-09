package programmers.Lv2.right;

import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else { // c == ')'
                if (stack.isEmpty()) {
                    return false; // 닫는 괄호에 맞는 여는 괄호가 없음
                }
                stack.pop();
            }
        }

        // 스택이 비어있어야 올바른 괄호
        return stack.isEmpty();
    }
}
