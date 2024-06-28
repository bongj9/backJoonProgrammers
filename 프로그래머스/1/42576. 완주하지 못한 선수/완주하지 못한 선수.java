import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }
        
        return null; // 모든 참가자가 완료한 경우는 null을 반환
    }
}