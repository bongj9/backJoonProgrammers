import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        
        if (isInvalid(input)) {
            System.out.println("Error!");
        } else if (input.contains("_")) {
            turnJava(input);
        } else {
            turnC(input);
        }
    }

    public static boolean isInvalid(String input) {
        // 대문자와 언더스코어가 함께 있는 경우
        if (containsUpperCase(input) && input.contains("_")) {
            return true;
        }
        // 언더스코어가 연속해서 나타나는 경우, 처음이나 끝에 있는 경우
        if (input.contains("__") || input.startsWith("_") || input.endsWith("_")) {
            return true;
        }
        // 대문자로 시작하는 경우
        if (Character.isUpperCase(input.charAt(0))) {
            return true;
        }
        return false;
    }

    public static boolean containsUpperCase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static void turnC(String input) {
        StringBuilder turncBuilder = new StringBuilder();
        for (Character c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                turncBuilder.append('_');
                turncBuilder.append(c);
            } else {
                turncBuilder.append(c);
            }
        }
        System.out.println(turncBuilder.toString());
    }

    public static void turnJava(String input) {
        StringBuilder turnJavaBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '_' && i + 1 < input.length() && input.charAt(i + 1) != ' ') {
                turnJavaBuilder.append(Character.toUpperCase(input.charAt(i + 1)));
                i++; // 다음 문자를 건너뜀
            } else if (input.charAt(i) != '_') { // '_'를 건너뜀
                turnJavaBuilder.append(input.charAt(i));
            }
        }
        System.out.println(turnJavaBuilder.toString());
    }
}