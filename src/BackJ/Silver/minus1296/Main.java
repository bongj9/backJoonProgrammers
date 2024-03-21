package BackJ.Silver.minus1296;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        //A열 받기
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }
        int different = differentSum(aSet,bSet);
        System.out.println(different);
/*
        int count = 0;
        for (Integer i : aSet) {
            if(!bSet.contains(i)) count++;
        }
        for (Integer i : bSet) {
            if(!aSet.contains(i)) count++;
        }
        System.out.println(count);
*/


        }
    public static int differentSum (Set <Integer> aSet, Set<Integer> bSet){
        int count = 0;
        for (Integer i : aSet) {
            if(!bSet.contains(i)) count ++;
        }
        for (Integer i : bSet) {
            if (!aSet.contains(i)) {
                count++;
            }
        }
        return count;
    }
}

