package BackJ.Silver.bear25192;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();
        int count = 0;
        String test = br.readLine();
        for (int i = 0; i < testCase-1; i++) {
            String input = br.readLine();
            if (!(input.equals("ENTER"))) {
                hashSet.add(input);
                count++;
            }else {
                hashSet.clear();
                String input1 = br.readLine();
                hashSet.add(input1);
            }
        }
        System.out.println((count + hashSet.size()));
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine()); // 입력 받을 전체 줄의 수
        HashSet<String> hashSet = new HashSet<>();
        int count = 0;

        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();
            if (input == null) { // 입력의 끝을 체크
                break;
            }
            if (!input.equals("ENTER")) {
                // 새로운 단어만 추가하고 카운트
                if (hashSet.add(input)) {
                    count++;
                }
            } else {
                // "ENTER"가 입력되면 HashSet을 비우고 카운트는 유지
                hashSet.clear();
            }
        }
        System.out.println(count);
    }
}

 */