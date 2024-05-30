import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputs = new int[3];
        
        // 세 개의 숫자를 입력받아 배열에 저장
        for (int i = 0; i < 3; i++) {
            int input = Integer.parseInt(br.readLine());
            inputs[i] = input;
        }

        // 세 개의 숫자를 곱하기
        int answer = 1;
        for (int input : inputs) {
            answer *= input;
        }

        // 숫자의 출현 횟수를 저장할 배열
        int[] count = new int[10];

        // 결과를 문자열로 변환하여 각 숫자의 빈도 세기
        String strAnswer = String.valueOf(answer);
        for (int i = 0; i < strAnswer.length(); i++) {
            int digit = strAnswer.charAt(i) - '0'; // 문자를 숫자로 변환
            count[digit]++; // 해당 숫자의 빈도를 증가
        }

        // 결과 출력
        for (int i = 0; i <= 9; i++) {
            System.out.println(count[i]);
        }
    }
}