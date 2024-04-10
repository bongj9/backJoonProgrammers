package programmers.pccp.alphabetAlone;
import java.util.*;
class Solution {
    public String solution(String input_string) {
        String answer = "";

        //외톨이 판별 맵
        Map<Character,Boolean> map = new HashMap<>();

        //중복 판별
        Set<Character> set = new TreeSet<>();

        char[] carr= input_string.toCharArray();

        char current=' ';

        for(char temp:carr){
            if(current!=temp){
                if(map.containsKey(temp)){
                    set.add(temp);
                }
                map.put(temp,true);
                current=temp;
            }
        }

        for(char temp :set){
            answer+=temp;
        }

        if(answer==""){
            return "N";
        }

        return answer;
    }
}
