package Bronze.Plus1110;

public class Main {
    public static void main(String[] args) {
        int n = 26;
        int res = n;
        int tmp = 0;
        int cnt = 0; //횟수 초기화 0
        do {
            tmp = res / 10 + res % 10;
            res = res % 10 + 10 + tmp % 10;
            cnt++;
        }
        while (n != res);
        System.out.println(cnt);
    }
}
