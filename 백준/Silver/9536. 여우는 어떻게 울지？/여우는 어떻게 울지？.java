import java.util.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String[] sounds = br.readLine().split(" ");
            Set<String> animalSounds = new HashSet<>();

            while (true) {
                String line = br.readLine();
                if (line.equals("what does the fox say?")) {
                    break;
                }
                String[] parts = line.split(" ");
                String sound = parts[2];
                animalSounds.add(sound);
            }

            StringBuilder foxSounds = new StringBuilder();
            for (String sound : sounds) {
                if (!animalSounds.contains(sound)) {
                    if (!foxSounds.isEmpty()) {
                        foxSounds.append(" ");
                    }
                    foxSounds.append(sound);
                }
            }
            System.out.println(foxSounds.toString());
        }
    }
}
