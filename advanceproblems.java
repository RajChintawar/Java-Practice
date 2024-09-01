import java.util.HashSet;

public class advanceproblems {
    public static int lengthOfLongestSubstring(String s) {
        // HashSet to store the characters in the current window
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        
        // Iterate through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If the character is already in the set, remove characters from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character to the set
            set.add(s.charAt(right));
            
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcdabcdbb";
        System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(s));
    }
}
