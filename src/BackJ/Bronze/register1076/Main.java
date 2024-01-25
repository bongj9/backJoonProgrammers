package BackJ.Bronze.register1076;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public enum oma {
        black, brown, red, orange, yellow, green, blue, violet, grey, white
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> lines = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            lines.add(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        int a = oma.valueOf(lines.get(0)).ordinal();
        int b = oma.valueOf(lines.get(1)).ordinal();
        int c = oma.valueOf(lines.get(2)).ordinal();
        sb.append(a).append(b);
        System.out.println((long) (Integer.parseInt(sb.toString()) * Math.pow(10, c)));
    }
}

