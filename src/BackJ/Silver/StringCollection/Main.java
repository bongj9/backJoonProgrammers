package BackJ.Silver.StringCollection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 0;
        int M = 0;
        String[] test = br.readLine().split(" ");
        N = Integer.parseInt(test[0]);
        M = Integer.parseInt(test[1]);
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        int count = 0;
        for (int i = 0; i < M; i++) {
            if (set.contains(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // 숫자 입력 후 남은 줄바꿈 문자 제거

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextLine());
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            if (set.contains(sc.nextLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}
*/
