package programmers.Lv2.test;

import java.util.*;
import java.io.*;
class Solution {
    static int s_i;
    public static int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        for(int i =row_begin;i<=row_end;i++){
            s_i = 0;
            s_i += data[i][col] % 2;
            s_i += data[i][col] % 3;

            answer ^= s_i;
        }
        return answer;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int col = Integer.parseInt(br.readLine());
        int row_begin = Integer.parseInt(br.readLine());
        int row_end = Integer.parseInt(br.readLine());
        int[][] data = new int[row_end][col];
        //2차원으로 값 받아왔음
        for(int i=0;i<=row_end;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),",");
            for(int j =0; j<col;j++){
                data [i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(data,col,row_begin,row_end));
    }
}