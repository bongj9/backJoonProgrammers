package Bronze.bee2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine()); //testcase수
        int count = 1;
        int range = 2;
        if (testcase == 1) {
            System.out.println(1);

        } else {
            while (range <= testcase) {
                range += (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
