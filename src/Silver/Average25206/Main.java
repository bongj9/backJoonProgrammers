package Silver.Average25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total = 0;
        //입력값
        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            double A = Double.parseDouble(input[1]);
            double B = gradeToScore(input[2]);
            total += A * B;
        }
        //등급은 점수로 변환해줘야한다
        //String[2]
        double averageScore = total / 20; // 평균 점수 계산
        System.out.printf("%.6f", averageScore); // 평균 점수 출력 (소수점 둘째자리까지)
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
}*/


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalWeightedScore = 0;
        double totalCredits = 0;

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            String grade = input[2];

            // "P" 학점 등급인 경우 점수 계산에서 제외
            if (!grade.equals("P")) {
                double credit = Double.parseDouble(input[1]);
                double score = gradeToScore(grade);
                totalWeightedScore += credit * score;
                totalCredits += credit;
            }
        }

        br.close();
        double averageScore = totalCredits == 0 ? 0 : totalWeightedScore / totalCredits;
        System.out.printf("%.6f", averageScore);
    }

    public static double gradeToScore(String grade) {
        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        return gradeMap.getOrDefault(grade, 0.0);
    }
}

