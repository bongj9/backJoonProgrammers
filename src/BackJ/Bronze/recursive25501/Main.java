package BackJ.Bronze.recursive25501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    static int count; // 재귀 함수 호출 횟수를 세는 전역 변수

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            count = 0; // 각 테스트 케이스마다 호출 횟수 초기화
            String input = br.readLine();
            int isPal = isPalindrome(input);
            System.out.println(isPal + " " + count);
        }
    }

    public static int recursion(String s, int l, int r){
        count++; // 재귀 호출 때마다 카운트 증가
        if(l >= r) return 1; // 베이스 케이스
        else if(s.charAt(l) != s.charAt(r)) return 0; // 팰린드롬이 아닌 경우
        else return recursion(s, l+1, r-1); // 재귀 호출
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
