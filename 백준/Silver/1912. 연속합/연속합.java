import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] inputs = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];
        //첫번째 값은 안변하니까 
        dp[0] = inputs[0];
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(inputs[i], dp[i-1] + inputs[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
