package BackJ.Silver.Alpha2941;

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
/*
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String result = replaceCroatianAlphabets(input);
        System.out.println(result.length());
    }

    // 크로아티아 알파벳을 대체하는 메서드
    public static String replaceCroatianAlphabets(String str) {
        String[] croatianAlphabets = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        for (String alphabet : croatianAlphabets) {
            str = str.replace(alphabet, "1"); // 각 크로아티아 알파벳을 '1'로 대체
        }
        return str;
    }
}
*/
