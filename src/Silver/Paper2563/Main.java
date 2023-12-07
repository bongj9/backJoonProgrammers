package Silver.Paper2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int[] X = new int[testcase];
        int[] Y = new int[testcase];
        for (int i = 0; i < testcase; i++) {
            String[] input = br.readLine().split(" ");
            X[i] = Integer.parseInt(input[0]);
            Y[i] = Integer.parseInt(input[1]);
        }

    }
}
