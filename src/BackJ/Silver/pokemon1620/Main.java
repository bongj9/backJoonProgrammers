package BackJ.Silver.pokemon1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //포켓몬의 개수
        int n = Integer.parseInt(st.nextToken());
        //내가 맞춰야 하는 문제의 개수
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, String> indexToName =new HashMap<Integer, String>();
        Map<String, Integer> nameToInteger = new HashMap<String, Integer>();
        //사용자에게 입력받은 값
        //굳이 문자열로 만듪필요없고 원바이원으로 해결할 수 있다.
        for (int i = 1; i <= n; i++) {
           String  pokemons = br.readLine();
            indexToName.put(i, pokemons);
            nameToInteger.put(pokemons, i);
        }
        //이어서 사용자에게 입력 받는 값2
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String myPokemon = br.readLine();
            //숫자라면
            if (myPokemon.matches("\\d+")) {
                int index = Integer.parseInt(myPokemon);
                sb.append(indexToName.get(index)).append("\n"); //줄바꿈
            } else sb.append(nameToInteger.get(myPokemon)).append("\n");
        }
        //문제 숫자와 문자를 임의로 입력받는데 어떻게 처리할 것인가
        System.out.println(sb.toString());
    }
}
