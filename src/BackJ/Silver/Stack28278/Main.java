package BackJ.Silver.Stack28278;
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            int operation = Integer.parseInt(command[0]);

            if (operation == 1) {
                int value = Integer.parseInt(command[1]);
                stack.push(value);
            } else {
                if (operation == 2) {
                    bw.write((stack.isEmpty() ? -1 : stack.pop()) + "\n");
                } else if (operation == 3) {
                    bw.write(stack.size() + "\n");
                } else if (operation == 4) {
                    bw.write((stack.isEmpty() ? 1 : 0) + "\n");
                }
                 else if (operation == 5) {
                    bw.write((stack.isEmpty() ? -1 : stack.peek()) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

