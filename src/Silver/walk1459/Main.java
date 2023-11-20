package Silver.walk1459;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] numbersString = line.split(" ");
        long [] numbers = new long[numbersString.length];
        //숫자를 나눠놓는것
        for (int i = 0; i < numbersString.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }



    }
    //알고리즘 구현
    public static int walktime() {

    }
}
