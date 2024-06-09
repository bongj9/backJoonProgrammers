package BackJ.Silver.s15312;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        int[] a = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < A.length(); i++) {
            list.add(a[A.charAt(i) - 'A']);
            list.add(a[B.charAt(i) - 'A']);
        }

        while (list.size() > 2) {
            ArrayList<Integer> newList = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                newList.add((list.get(i) + list.get(i + 1)) % 10);
            }
            list = newList;
        }

        System.out.println("" + list.get(0) + list.get(1));
    }
}
    //정수의 궁합
/*
    private static void solve(int a, int b) {
            answer = (a + b) % 10;
    }

    //배열의 끝에 -1을 추가
    //-1일때 break
    private static void solve2(int[] a, int[] b) {

    }
}
*/
