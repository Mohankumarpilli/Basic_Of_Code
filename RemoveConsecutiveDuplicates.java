//public class RemoveConsecutiveDuplicates {
//    public static String removeConsecutiveDuplicates(String S) {
//        int index = -1;
//        String temp = "";
//        for(int i = 1; i < S.length();i++){
//            int j = i-1;
//            int count = 0;
//            while(j >= 0){
//                if(S.charAt(j) != S.charAt(i)){
//                    break;
//                }
//                count++;
//                j--;
//            }
//            int k = i;
//            while(k < S.length()){
//                if(S.charAt(k) != S.charAt(i)){
//                    break;
//                }
//                count++;
//                k++;
//            }
//            if(count > 0 && count % 2 == 0){
//                for(int p = 0; p < S.length(); p++){
//                    if(p < j + 1 || p > k - 1){
//                        temp += S.charAt(p);
//                    }
//                }
//                S = temp;
//                temp = "";
//                i = index;
//                index = -1;
//            }
//        }
//        return S;
//    }
//
//    public static void main(String[] args) {
//        String input1 = "abbcbddd";
//        String input2 = "azxxzyyyddddyzzz";
//
//        System.out.println("Output for input1: " + removeConsecutiveDuplicates(input1)); // Output: acbdod
//        System.out.println("Output for input2: " + removeConsecutiveDuplicates(input2)); // Output: azzz
//    }
//}
import java.util.*;

public class RemoveConsecutiveDuplicates {

    public static String convertString(String str) {
        int n = str.length();
        List<Pair> arr = new ArrayList<>();
        char currChar = str.charAt(0);
        int count = 1;

        // Construct the list of pairs (character, count of consecutive occurrences)
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == currChar) {
                count++;
            } else {
                arr.add(new Pair(currChar, count));
                currChar = str.charAt(i);
                count = 1;
            }
        }

        arr.add(new Pair(currChar, count)); // Add the last pair

        // Stack to manage the pairs based on the condition
        Stack<Pair> stack = new Stack<>();
        for (Pair p : arr) {
            if (p.count % 2 == 1) { // Check if count is odd
                if (!stack.isEmpty() && stack.peek().ch == p.ch && (stack.peek().count + p.count) % 2 == 0) {
                    stack.pop();
                } else {
                    stack.push(p);
                }
            }
        }

        // Construct the result from the stack
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair topPair = stack.pop();
            for (int i = 0; i < topPair.count; i++) {
                ans.append(topPair.ch);
            }
        }

        return ans.reverse().toString();
    }

    // Helper class to represent (character, count) pairs
    static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        System.out.println(convertString("aabbzzbz"));   // Output: "az"
        System.out.println(convertString("aaabbbzzbz")); // Output: "azbz"
        System.out.println("Output for input1: " + convertString("abbcbddd")); // Output: acbdod
        System.out.println("Output for input2: " + convertString("azxxzyyyddddyzzz"));
    }
}
