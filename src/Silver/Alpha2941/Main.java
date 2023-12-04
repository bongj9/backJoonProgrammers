package Silver.Alpha2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String result = alphabet(input);
        int cnt = 0; //횟수
        System.out.println(result.length());
        }
    //String은 불변객체이기때문에 다시 선언해줘야한다.
    // 변경 메서드 수정
    public static String alphabet(String a) {
        a = a.replace("lj", "l");
        a = a.replace("dz", "d");
        a = a.replace("nj", "n");
        a = a.replace("=", "");
        a = a.replace("-", "");
        return a;
    }
}
