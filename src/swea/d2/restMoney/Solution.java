package swea.d2.restMoney;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            int[] restmoney = new int[8];
            int money = Integer.parseInt(br.readLine());
            if(money % 10 != 0 ) {
                money -= (money % 10);
            }
            int tmpMoney = money;
            if (tmpMoney >= 50000) {
                restmoney[0] = money / 50000;
                tmpMoney = money % 50000;
            }
            if (tmpMoney >= 10000) {
                restmoney[1] = tmpMoney / 10000;
                tmpMoney %= 10000;
            }
            if (tmpMoney >= 5000) {
                restmoney[2] = tmpMoney / 5000;
                tmpMoney %= 5000;
            }
            if (tmpMoney >= 1000) {
                restmoney[3] = tmpMoney /1000;
                tmpMoney %= 1000;
            }
            if (tmpMoney >= 500) {
                restmoney[4] = tmpMoney / 500;
                tmpMoney %= 500;
            }
            if (tmpMoney >= 100) {
                restmoney[5] = tmpMoney / 100;
                tmpMoney %= 100;
            }
            if (tmpMoney >= 50) {
                restmoney[6] = tmpMoney / 50;
                tmpMoney %= 50;
            }
            if (tmpMoney >= 10) {
                restmoney[7] = tmpMoney / 10;
                tmpMoney %= 10;
            }
            System.out.println("#"+testcase);
            for (int i1 : restmoney) {
                System.out.print(i1+" ");
            }
        }
    }
}