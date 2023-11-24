package Silver.NumberCard10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine()); //처음 N개를 넣어줌
        String [] Sysinput = br.readLine().split(" ");
        int userTestCase = Integer.parseInt(br.readLine());
        String[] UserInput = br.readLine().split(" ");

    }

    public static void CardMatch(int[] arr, int[] arr2) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if (arr[i] ==arr2 [j]){
                    System.out.println(1);
                } else System.out.println(0);
            }
        }

    }

}
