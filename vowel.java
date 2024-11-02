public class vowel {
    public static int longestJump(String bridge) {
        String vowels = "AEIOU";
        int maxDistance = 0;
        int previousVowelIndex = -1;
        for (int i = 0; i < bridge.length(); i++) {
            char currentChar = bridge.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                if (previousVowelIndex == -1) {
                    maxDistance = Math.max(maxDistance, i + 1);
                } else {
                    maxDistance = Math.max(maxDistance, i - previousVowelIndex);
                }
                previousVowelIndex = i;
            }
        }

        if (previousVowelIndex != -1) {
            maxDistance = Math.max(maxDistance, bridge.length() - previousVowelIndex);
        } else {
            maxDistance = bridge.length();
        }
        return maxDistance;
    }

    public static void main(String[] args) {
        System.out.println(longestJump("LSKJDFHAWUEA;IKLJJAEWOIDJLDZXC"));
    }
}
