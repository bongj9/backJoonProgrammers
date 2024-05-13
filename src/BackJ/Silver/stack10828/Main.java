package BackJ.Silver.stack10828;

/*import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String input1 = st.nextToken();
            if(input1.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if (input1.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }else if(input1.equals("size")){
                System.out.println(stack.size());
            }else if(input1.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                }else  System.out.println(0);
            }else if(input1.equals("top")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else System.out.println(stack.peek());
            }
        }

    }
}*/

import java.io.*;
        import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int testcase = Integer.parseInt(br.readLine().trim()); // 입력 처리 시 불필요한 공백 제거

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
            String input1 = st.nextToken();

            switch (input1) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    System.out.println(stack.isEmpty() ? -1 : stack.peek());
                    break;
            }
        }
    }
}

