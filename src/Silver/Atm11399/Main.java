package Silver.Atm11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int[] people = new int[testcase]; //생성
        String[] input = br.readLine().split(" "); //
        for (int i = 0; i <testcase ; i++) {
            people[i] = Integer.parseInt(input[i]);
        }
        sort(people);
        int time = 0;
        int total = 0;
        for (int i = 0; i < testcase; i++) {
            time += people[i];
            total += time;
        } //int total = 0; for each문으로 바꿨을때
 /*       int cumSum = 0;
        for (int time : people) {
            cumSum += time;
            total += cumSum;
        }
        System.out.println(total);
*/
        System.out.println(total);

    }


    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
