package Silver.NumberCard10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine()); //처음 N개를 넣어줌
        String [] Sysinput = br.readLine().split(" ");
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

/*        for (int i = 0; i < testcase; i++) {
            arr[i] = Integer.parseInt(Sysinput[i]);
        }*/
        int userTestCase = Integer.parseInt(br.readLine());
        String[] UserInput = br.readLine().split(" ");
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        CardMatch(arr, arr2);

    }

    public static void CardMatch(int[] arr, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for (int query : arr2) {
            if (set.contains(query)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}
