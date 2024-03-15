package BackJ.Bronze.sort2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String[] input = new String[testcase];
        for (int i = 0; i < testcase; i++) {
            input[i] = st.nextToken();
        }
        Arrays.sort(input);
        for (String s : input) {
            System.out.println(s);
        }
    }
}
