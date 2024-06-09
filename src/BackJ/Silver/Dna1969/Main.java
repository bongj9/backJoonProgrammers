package BackJ.Silver.Dna1969;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        int hammingDistance = 0;

        for (int i = 0; i < N; i++) {
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int j = 0; j < M; j++) {
                char d = arr[j][i];
                hm.put(d, hm.getOrDefault(d, 0) + 1);
            }

            int max = 0;
            char answer = ' ';

            for (char c : hm.keySet()) {
                if (hm.get(c) > max || (hm.get(c) == max && c < answer)) {
                    max = hm.get(c);
                    answer = c;
                }
            }

            sb.append(answer);
            hammingDistance += N - max;
        }

        System.out.println(sb);
        System.out.println(hammingDistance);


    }
}