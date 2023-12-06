package Silver.Average25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total = 0;
        //입력값
        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            double A = Integer.parseInt(input[1]);
            double B = Integer.parseInt(input[2]);
            total += A * B;
        }
        //등급은 점수로 변환해줘야한다
        //String[2]
        double averageScore = total / 20; // 평균 점수 계산
        System.out.printf("%.2f", averageScore); // 평균 점수 출력 (소수점 둘째자리까지)
    }
    //등급
    public static double gradeToScore(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F+":
                return 0.0;
            case "P":
                return 0.0;
            default:
                return 0;
            // 유효하지 않은 학점이 입력된 경우

        }

    }
}
