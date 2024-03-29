package SoftwareMaestro.Silver2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] step = new int[t+1]; // 계단 점수 배열
        int[] dp = new int[t+1]; // 동적 프로그래밍 배열

        for (int i = 1; i <= t; i++) {
            step[i] = Integer.parseInt(br.readLine());
        }

        // 초기값 설정
        dp[1] = step[1];
        if (t >= 2) {
            dp[2] = step[1] + step[2];
        }
        // 계단 오르기 메서드 호출 (이 경우 직접 메서드를 호출하지 않고 메인에서 처리)
        for (int i = 3; i <= t; i++) {
            dp[i] = Math.max(dp[i-2] + step[i], dp[i-3] + step[i-1] + step[i]);
        }

        System.out.println(dp[t]); // 최대 점수 출력
    }
}

/*
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

// 계단 오르기 로직을 담당하는 클래스
class StairClimber {
    private int[] step;
    private int[] dp;
    private int numberOfSteps;

    public StairClimber(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
        this.step = new int[numberOfSteps + 1];
        this.dp = new int[numberOfSteps + 1];
    }

    public void setStepScores(int stepIndex, int score) {
        this.step[stepIndex] = score;
    }

    public int calculateMaxScore() {
        if (numberOfSteps < 1) {
            return 0;
        }

        dp[1] = step[1];
        if (numberOfSteps >= 2) {
            dp[2] = step[1] + step[2];
        }

        for (int i = 3; i <= numberOfSteps; i++) {
            dp[i] = Math.max(dp[i-2] + step[i], dp[i-3] + step[i-1] + step[i]);
        }

        return dp[numberOfSteps];
    }
}

// 메인 클래스
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StairClimber climber = new StairClimber(t);

        for (int i = 1; i <= t; i++) {
            int score = Integer.parseInt(br.readLine());
            climber.setStepScores(i, score);
        }

        System.out.println(climber.calculateMaxScore()); // 최대 점수 출력
    }
}
*/

