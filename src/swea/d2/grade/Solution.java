package swea.d2.grade;

/*import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        double[] sum = null;
        for (int i = 1; i <= testcase; i++) {
            HashMap<Integer, Double> map = new HashMap<>();
            sum = new double[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            int student = Integer.parseInt(st.nextToken());
            int[][] studentgrade = new int[students][3];
            for (int j = 0; j < students; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 3; k++) {
                    studentgrade[j][k] = Integer.parseInt(st.nextToken());
                }

            }
            for (int j = 0; j < students; j++) {
                sum[j] = 0.35 * studentgrade[j][0] + 0.45 * studentgrade[j][1] + 0.2 * studentgrade[j][2];
                map.put(j + 1, sum[j]);
            }
        }
        Arrays.sort(sum);


        }
    }*/
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            int targetStudent = Integer.parseInt(st.nextToken()) - 1;  // 학생 인덱스는 0부터 시작
            double[] scores = new double[students];
            int[][] studentgrade = new int[students][3];

            for (int j = 0; j < students; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 3; k++) {
                    studentgrade[j][k] = Integer.parseInt(st.nextToken());
                }
                scores[j] = 0.35 * studentgrade[j][0] + 0.45 * studentgrade[j][1] + 0.2 * studentgrade[j][2];
            }

            // 원본 점수 복사 및 정렬
            double[] sortedScores = Arrays.copyOf(scores, scores.length);
            Arrays.sort(sortedScores);

            // 등급 매핑
            String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
            HashMap<Double, String> gradeMap = new HashMap<>();
            for (int j = 0; j < students; j++) {
                int gradeIndex = (int) ((double) j / students * 10);
                gradeMap.put(sortedScores[students - 1 - j], grades[gradeIndex]);
            }
            // 출력
            System.out.println("#" + (i + 1) + " " + gradeMap.get(scores[targetStudent]));
        }
    }
}



