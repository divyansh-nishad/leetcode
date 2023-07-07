import java.util.HashMap;
import java.util.Map;

public class MaximiseTheConfusionOfAnExam {

    public int maxConsecutiveAnswers(String answerKey, int k) {
        int maxFreq = 0;
        int i = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        for (int j = 0; j < answerKey.length(); j++) {
            char currentChar = answerKey.charAt(j);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
            maxFreq = Math.max(maxFreq, charCount.get(currentChar));

            if (j - i + 1 > maxFreq + k) {
                charCount.put(answerKey.charAt(i), charCount.get(answerKey.charAt(i)) - 1);
                i++;
            }
        }

        return answerKey.length() - i;
    }

}
