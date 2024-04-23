package swea.d2.timePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcases; i++) {
            int time = 0;
            int minute = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int[] inputs = new int[st.countTokens()];
            for (int j = 0; j < 4; j++) {
                inputs[j] = Integer.parseInt(st.nextToken());
            }
            //시간끼리 더한것
            if ((inputs[1] + inputs[3]) / 60 > 1) {
                time = (inputs[0] + inputs[2] + 1) % 12;
                minute = (inputs[1] + inputs[3]) % 60;
            }else {
                time = (inputs[0] + inputs[2] ) % 12;
                minute = (inputs[1] + inputs[3]) % 60;
            }
            if(time == 0){
                time = 12;
            }
            System.out.println("#" + (i + 1) + " " + time +" " + minute);

        }
    }
}
