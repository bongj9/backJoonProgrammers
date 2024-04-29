package swea.d2.building;

import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 10; i++) {
            //빌딩의 개수
            int bc = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int[] views = new int[bc];
            for (int j = 0; j < bc; j++) {
                views[j] = Integer.parseInt(st.nextToken());
            }
            int result = countBuild(views);
            System.out.println("#" + i + " " + result);
        }
    }

    private static int countBuild(int[] views) {
        int totalViews = 0;
        for (int i = 2; i < views.length-2; i++) {
            int current = views[i];
            int aroundMax = Math.max(Math.max(views[i - 2], views[i - 1]), Math.max(views[i + 1], views[i + 2]));
            if (current > aroundMax) {
                totalViews += current - aroundMax;
            }
        }
        return totalViews;
    }
}
