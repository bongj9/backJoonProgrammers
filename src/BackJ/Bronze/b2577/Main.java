package BackJ.Bronze.b2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputs = new int[3];

        for (int i = 0; i < 3; i++) {
            int input = Integer.parseInt(br.readLine());
            inputs[i] = input;
        }
        int answer = 1;
        for (int input : inputs) {
            answer *= input;
        }
        int[] count = new int[10];
        String strAnswer = String.valueOf(answer);
        for (int i = 0; i < strAnswer.length(); i++) {
            int number = strAnswer.charAt(i) - '0'; // 문자를 숫자로 변환
            count[number]++;
        }
        for (int i : count) {
            System.out.println(i);
        }
    }
}