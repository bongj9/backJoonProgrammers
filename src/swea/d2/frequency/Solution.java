package swea.d2.frequency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            int test = Integer.parseInt(br.readLine());
            int [] inputs = new int[1000];
            HashMap<Integer, Integer> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < inputs.length; j++) {
                inputs[j] = Integer.parseInt(st.nextToken());
            }
            //키값이 숫자 ,벨류가 빈도수
            for (int input : inputs) {
                if(map.containsKey(input)) {
                    map.put(input, map.get(input) + 1);
                } map.put(input, 1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            }

        }
    }
}
