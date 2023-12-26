package Bronze.L2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            int money = Integer.parseInt(br.readLine());

            int Quarter = money / 25;
            money %= 25;

            int Dime = money / 10;
            money %= 10;

            int Nickel = money / 5;
            money %= 5;

            int Penny = money;

            System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);
        }
        br.close();
    }
}
