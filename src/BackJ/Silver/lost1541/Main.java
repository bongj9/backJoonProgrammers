package BackJ.Silver.lost1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int resultSum = 0;
        //분류를 해야한다
        //사용자에게 값을 받아오기 문자열로
        String input = br.readLine();
        //-+로 나누기
        String[] str = input.split("-");
        //몇개가 만들졌는지 확인해야해
        for (int i = 0; i < str.length; i++) {
            int partSum = 0;
            StringTokenizer remainStr = new StringTokenizer(str[i], "+");
            while (remainStr.hasMoreTokens()) {
                partSum += Integer.parseInt(remainStr.nextToken());
            }
            if (i == 0) {
                resultSum += partSum;
            } else resultSum -= partSum;
        }
        System.out.println(resultSum);
    }

}
