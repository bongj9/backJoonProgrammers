package BackJ.Silver.bracket9012;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();
            if (isVps(input)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }

    public static boolean isVps(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
/*    public static boolean isVps(String s) {
        Stack<Character> vps = new Stack<>();
        for (char vp : s.toCharArray()) {
            if (vp == '(') {
                vps.push(vp);
            } else if (vp == ')') {
                if (vps.isEmpty()) {
                    return false;
                }
                vps.pop();
            }
        }
        return vps.isEmpty();
    }
}*/

       /* *//*
        하나하나 슬라이싱을해서 집어넣는다
         *//*
        for (int i = 0; i < testCase; i++) {
            String s = st.nextToken();


            }
        }

    boolean isTrue() {

    }
    }*/

