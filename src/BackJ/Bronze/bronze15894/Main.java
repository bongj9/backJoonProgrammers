package BackJ.Bronze.bronze15894;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //개수입력받기
        long n = Integer.parseInt(br.readLine());
        long sum = n * 4;
        System.out.println(sum);
    }

}
