package BackJ.Silver.solvedAc18110;

/*import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        if (testcase < 2) {
            System.out.println(0);
            return;
        }
        int[] t = new int[testcase];
        int[] b = new int[testcase - 2];
        for (int i = 0; i < testcase; i++) {
            int n = Integer.parseInt(br.readLine());
            t[i] = n;
        }
        Arrays.sort(t);

        for (int i = 1; i < t.length - 1; i++) {
            b[i - 1] = t[i]; // 올바른 복사 로직
        }
        int sum = 0;
        for (int i : b) {
            sum += i;
        }
        // 정수 나눗셈의 결과를 반올림
        System.out.println(Math.round((double) sum / b.length));
    }
}*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        if (testcase == 0) {
            System.out.println(0);
            return;
        }

        int[] t = new int[testcase];
        for (int i = 0; i < testcase; i++) {
            t[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(t);

        int count = (int) Math.round(testcase * 0.15);
        int[] b = Arrays.copyOfRange(t, count, testcase - count);

        long sum = 0;
        for (int value : b) {
            sum += value;
        }
        System.out.println((int)Math.round((float) sum /b.length));
    }
}
