package BackJ.Bronze.Plus1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = n;
        int tmp;
        int cnt = 0; // 횟수 초기화 0
        do {
            tmp = res / 10 + res % 10; // 각 자릿수를 더함
            res = (res % 10) * 10 + tmp % 10; // 새로운 수를 생성
            cnt++;
        } while (n != res);
        System.out.println(cnt);
    }
}
