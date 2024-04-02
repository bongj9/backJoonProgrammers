package BackJ.Bronze.factorial2_27433;

import java.util.Scanner;

public class Main {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }
    private static Long factorial(int n) {
        if (n <= 1) {
            return (long) n;
        }else {
            return n * factorial(n - 1);
        }
    }

}
