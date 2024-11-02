import java.util.HashMap;
import java.util.Map;

public class UniqueString {

    // Method to remove unique characters from the string
    public static String removeUniqueChars(String s) {
        // Continue until the string becomes empty
        while (true) {
            // Create a frequency map to count occurrences of each character
            Map<Character, Integer> freqMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            // Identify unique characters
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (freqMap.get(c) > 1) {
                    sb.append(c);
                }
            }

            // If no characters are left or the string is unchanged, break the loop
            if (sb.length() == 0 || sb.toString().equals(s)) {
                return s;
            }

            // Update the string
            s = sb.toString();
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        System.out.println(removeUniqueChars("xxyyz"));  // Output: x
        System.out.println(removeUniqueChars("man"));     // Output: man
    }
}
