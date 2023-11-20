package Silver.walk1459;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        long x = Long.parseLong(line[0]);
        long y = Long.parseLong(line[1]);
        long w = Long.parseLong(line[2]);
        long s = Long.parseLong(line[3]);

        cal(x, y, w, s);

    }

    //알고리즘 구현
    public static void cal(Long x, Long y, Long w, Long s) {
        long temp1 = (x + y) * w;
        long temp2 = 0;
        if ((x + y) % 2 == 0) {
            temp2 = Math.max(x, y) * s;

        }
        else{
            temp2 = (Math.max(x, y) * s )+ w;
        }
        long temp3 = (Math.min(x, y))*s+(Math.abs(x-y))*w;

        System.out.println(Math.min(temp1, Math.min(temp2, temp3)));
    }
}

