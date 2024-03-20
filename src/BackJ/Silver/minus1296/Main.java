package BackJ.Silver.minus1296;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int[] a = new int[n];
        int[] b = new int[m];
        Map<Integer, Integer> aMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(Arrays.toString(br.readLine().split(" ")));
            aMap.put(i, a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(Arrays.toString(br.readLine().split(" ")));
        }


        }

    }

