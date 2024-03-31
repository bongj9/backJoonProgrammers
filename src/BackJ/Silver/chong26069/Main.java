package BackJ.Silver.chong26069;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        String userA, userB;
        HashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("ChongChong");

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            userA = st.nextToken();
            userB = st.nextToken();
            if (hashSet.contains(userA) || hashSet.contains(userB)) {
                hashSet.add(userA);
                hashSet.add(userB);
            }
        }
        System.out.println(hashSet.size());
    }
}
