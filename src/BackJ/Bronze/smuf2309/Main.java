package BackJ.Bronze.smuf2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] smufs = new int[9];
        int sum = 0;
        //숫자받는거
        for (int i = 0; i < 9; i++) {
            smufs[i] = Integer.parseInt(br.readLine());
            sum += smufs[i];
        }
        int smuf1 = 0;
        int smuf2 = 0;
        Arrays.sort(smufs);
        for (int i = 0; i < smufs.length-1; i++) {
            for (int j = i + 1; j < smufs.length; j++) {
                if (sum - smufs[i] - smufs[j] == 100) {
                    smuf1 = i;
                    smuf2 = j;
                }
            }
        }
        for(int i=0;i<smufs.length;i++) {
            if(i!=smuf1 && i!=smuf2) {
                System.out.println(smufs[i]);
            }
        }
    }
}

