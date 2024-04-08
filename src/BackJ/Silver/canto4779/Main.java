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
/*
import java.util.Scanner;

public class CantorSetString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            String cantorSet = generateCantorSet((int) Math.pow(3, n));
            System.out.println(cantorSet);
        }
        scanner.close();
    }

    private static String generateCantorSet(int length) {
        // 기저 조건: 길이가 1인 경우, "-"를 반환
        if (length == 1) return "-";

        // 재귀적으로 이전 단계의 칸토어 집합을 생성
        String part = generateCantorSet(length / 3);
        String space = " ".repeat(length / 3);

        // 세 부분을 조합하여 새로운 칸토어 집합 생성
        return part + space + part;
    }
}

 */
