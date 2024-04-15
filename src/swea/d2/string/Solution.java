package swea.d2.string;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 1; i <= testcase; i++) {
            String s = br.readLine();
            int count = 0;
            int div = (int) s.length()/2;
            if (s.substring(0, div - 1) == s.substring(div + 1, s.length())) {
                count = 1;
            }
            System.out.println('+' +i+" " + count);
        }
    }
}*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 1; i <= testcase; i++) {
            String s = br.readLine();
            int count = 0;  // 회문이면 1, 아니면 0
            if (isPalindrome(s)) {
                count = 1;
            }
            System.out.println("#" + i + " " + count);
        }
    }

    private static boolean isPalindrome(String s) {
        int n = s.length();
        for (int j = 0; j < n / 2; j++) {
            if (s.charAt(j) != s.charAt(n - j - 1)) {
                return false;
            }
        }
        return true;
    }
}




