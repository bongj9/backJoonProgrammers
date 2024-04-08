package BackJ.Silver.canto4779;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            char[] arr = new char[(int) Math.pow(3, n)];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = '-';
            }
            recursive(arr, 0, arr.length, ' ');
            System.out.println(arr);
        }


    }
    //빈칸 만들어주기
    private static void recursive(char[] arr, int start ,int end, char fill) {
        if (end - start == 1) {
            return;
        }
        int segment = (end - start) / 3;
        for (int i = start+ segment; i < start + segment * 2; i++) {
            arr[i] = fill;
        }
        recursive(arr, start, start + segment, fill);
        recursive(arr, start + segment * 2, end, fill);

    }
}
