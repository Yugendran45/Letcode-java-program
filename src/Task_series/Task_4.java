package Task_series;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Task_4 {
	
	public static void main(String[] args) {
		
        String str = "abcabc";
         
        HashSet<Character> processedChars = new LinkedHashSet<Character>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (processedChars.contains(c)) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                char d = str.charAt(j);
                if (c == d) {
                    count++;
                }
            }

            processedChars.add(c);

            System.out.println(c + " -> " + count);
        }
    }
}