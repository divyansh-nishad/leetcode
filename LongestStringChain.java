import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain {
    public int longestStrChain(String[] words) {
        // Step 1: Sort the words array by length.
        Arrays.sort(words, (String a, String b) -> a.length() - b.length());

        // Step 2: Create a HashMap to store word-to-length relationships.
        Map<String, Integer> dp = new HashMap<>();

        // Initialize the maximum path length to 1 (a single word).
        int maxPath = 1;

        // Step 3: Iterate through the words.
        for (String word : words) {
            int currLength = 1; // Initialize the current word length to 1.
            StringBuilder sb = new StringBuilder(word);

            // Step 4: Iterate through each character of the current word.
            for (int i = 0; i < word.length(); i++) {
                sb.deleteCharAt(i); // Remove the current character.
                String prevWord = sb.toString(); // Get the predecessor word.

                // Update the current word length using dynamic programming.
                currLength = Math.max(currLength, dp.getOrDefault(prevWord, 0) + 1);

                // Restore the original word for the next iteration.
                sb.insert(i, word.charAt(i));
            }

            // Step 5: Store the current word and its calculated length in the map.
            dp.put(word, currLength);

            // Update the maximum path length if necessary.
            maxPath = Math.max(maxPath, currLength);
        }

        // Step 6: Return the maximum path length.
        return maxPath;
    }

}
