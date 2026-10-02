
public class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";

        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the character's counterpart exists in the set, continue checking
            if (set.contains(Character.toLowerCase(c)) && set.contains(Character.toUpperCase(c))) {
                continue;
            }

            // Divide and Conquer on left and right sub-parts
            String left = longestNiceSubstring(s.substring(0, i));
            String right = longestNiceSubstring(s.substring(i + 1));

            // Return the longer nice substring; prefer left in case of a tie
            return left.length() >= right.length() ? left : right;
        }

        return s; // Entire string is nice
    }
}