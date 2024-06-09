spackage BackJ.Silver.s3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int[] arr = new int[testcase];
        Set<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < testcase; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
//            set.add(arr[i]);
        }
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;
        //값이 한번만 추가가 되도록 처리
        for (int i = 0; i < testcase; i++) {
            if (set.contains(x - arr[i])) {
                cnt++;
            }
            set.add(arr[i]);
        }
        System.out.println(cnt);
    }
}


        //맵 자료구조로 사용해보기

        //이중포문은 시간초과
//        for (int i = 0; i < testcase; i++) {
//            inputs[i] =Integer.parseInt(st.nextToken());
//        }
//        int x = Integer.parseInt(br.readLine());
//        int count = 0;
//        for (int i = 0; i < testcase; i++) {
//            for (int j = i+1; j < testcase; j++) {
//                if (inputs[i] + inputs[j] == x) {
//                    list.add(i);
//                }
//            }
//        }
//        System.out.println(list.size());
    }
}
