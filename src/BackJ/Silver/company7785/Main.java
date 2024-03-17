package BackJ.Silver.company7785;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //2차원 배열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        String[] x = new String[n];
//        String[] y = new String[n];
//        //이렇게 생성하는것은 한줄로 다 받겠다는거임으로 반복문안에 생성해야한다.
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        for (int i = 0; i < n; i++) {
//            x[i] = st.nextToken();
//            y[i] = st.nextToken();
//        }
//        for (int i = 0; i <n ; i++) {
//            if (!(y[i].contains("leave"))) {
//                System.out.println(x[i]);
//            }
//        }
        Map<String, Boolean> login = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String status = st.nextToken();
            //boolean으로 저장된다. 있으면 true 없으면 false
            login.put(name, status.equals("enter"));
        }
        List<String> names = new ArrayList<>();
        for (String name : login.keySet()) {
            if (login.get(name)) {
                names.add(name);
            }
        }
        //내림차순 정렬
        Collections.sort(names, Collections.reverseOrder());

        for (String name : names) {
            System.out.println(name);
        }
    }
/*
1.한줄로 쭉 받는게 아니라서 반복문안에 StringTokenizer를 생성
2.
 */
}
