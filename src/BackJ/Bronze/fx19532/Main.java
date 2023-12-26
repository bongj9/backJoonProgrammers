package BackJ.Bronze.fx19532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] test = new int[6];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < 6; i++) {
            test[i] = Integer.parseInt(input[i]);
        }
        int divide = test[0] * test[4] - test[1] * test[3];
        if (divide != 0) {
            int x = (test[4] * test[2] - test[1] * test[5]) / divide;
            int y = (-test[3] * test[2] + test[0] * test[5]) / (divide);
            System.out.println(x + " " + y);
        }
    }
}
/*
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] coefficients = new int[6];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < 6; i++) {
            coefficients[i] = Integer.parseInt(input[i]);
        }
        int denominator = coefficients[0] * coefficients[3] - coefficients[1] * coefficients[2];
        if (denominator != 0) {
            int x = (coefficients[4] * coefficients[3] - coefficients[1] * coefficients[5]) / denominator;
            int y = (coefficients[0] * coefficients[5] - coefficients[4] * coefficients[2]) / denominator;
            System.out.println("x = " + x + ", y = " + y);
        } else {
            System.out.println("The equations have no unique solution.");
        }
    }
}
*/
