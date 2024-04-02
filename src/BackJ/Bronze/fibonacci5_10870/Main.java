package BackJ.Bronze.fibonacci5_10870;

import java.util.*;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        System.out.println(fibonacci(test));
    }

    //0,1일때 값을 만들어주고 기본값을 식으로 만든다
    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
