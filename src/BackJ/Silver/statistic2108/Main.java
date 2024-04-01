package BackJ.Silver.statistic2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(inputs);
        System.out.println(s1(inputs)); // 산술평균 출력
        System.out.println(s2(inputs)); // 중앙값 출력
        System.out.println(s3(inputs)); // 최빈값 출력
        System.out.println(s4(inputs)); // 범위 출력


    }

    /*private static int s1(int[] inputs) {
        int sum = 0;
        for (int i = 0; i < inputs.length; i++) {
          sum += inputs[i];
        }
        return sum / inputs.length;
    }
*/
    private static int s1(int[] inputs) {
        double sum = 0; // 변경: 정확한 평균을 위해 double 사용
        for (int i = 0; i < inputs.length; i++) {
            sum += inputs[i];
        }
        return (int)Math.round(sum / inputs.length); // 변경: 반올림하여 int로 형변환
    }
    //double로 소수점까지 받고 반올림하여 형변환까지 해줘야한다

    private static int s2(int[] inputs) {
        return inputs[inputs.length / 2];
    }

    private static int s3(int[] inputs) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : inputs) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        int maxFrequency = 0;
        for (int key : frequencyMap.keySet()) {
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(key));
        }

        ArrayList<Integer> mostFrequentNumbers = new ArrayList<>();
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == maxFrequency) {
                mostFrequentNumbers.add(key);
            }
        }

        Collections.sort(mostFrequentNumbers);

        if (mostFrequentNumbers.size() == 1) {
            return mostFrequentNumbers.get(0);
        } else {
            // 여기서 "두 번째로 작은" 최빈값을 찾아야 하는데, 그러기 위해선 최소 2개 이상의 최빈값이 있어야 함.
            // mostFrequentNumbers 리스트는 이미 정렬되어 있으므로, 두 번째 요소를 반환합니다.
            return mostFrequentNumbers.get(1);
        }
    }

    //범위
    private static int s4(int[] inputs) {
        int a = Integer.MAX_VALUE; // 가능한 최대값으로 초기화
        int b = Integer.MIN_VALUE; // 가능한 최소값으로 초기화
        for (int input : inputs) {
            a = Math.min(a, input); // a를 현재값과 비교하여 더 작은 값을 a에 저장
            b = Math.max(b, input); // b를 현재값과 비교하여 더 큰 값을 b에 저장
        }
        return b - a; // 최대값과 최소값의 차이 반환
    }

}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(inputs); // 입력받은 수들을 정렬합니다.

        System.out.println(s1(inputs));
        System.out.println(s2(inputs));
        System.out.println(s3(inputs));
        System.out.println(s4(inputs));
    }

    private static int s1(int[] inputs) {
        int sum = 0;
        for (int value : inputs) {
            sum += value;
        }
        return Math.round((float)sum / inputs.length);
    }

    private static int s2(int[] inputs) {
        // 중앙값
        return inputs[inputs.length / 2];
    }

    private static int s3(int[] inputs) {
        // 최빈값
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int input : inputs) {
            frequencyMap.put(input, frequencyMap.getOrDefault(input, 0) + 1);
        }

        int maxFrequency = frequencyMap.values().stream().max(Integer::compare).orElse(0);

        List<Integer> mostFrequent = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxFrequency)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());

        // 최빈값이 여러 개 있을 경우, 두 번째로 작은 값을 선택
        return mostFrequent.size() > 1 ? mostFrequent.get(1) : mostFrequent.get(0);
    }

    private static int s4(int[] inputs) {
        // 범위
        return inputs[inputs.length - 1] - inputs[0];
    }
}

 */