public class MaximumScoreWordsFormedbyLetters {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq = new int[26];
        for (char ch : letters) {
            freq[ch - 'a']++;
        }
        return max (words,score,freq,0);
    }
    int max (String[] words,int[] score,int[] freq,int ind) {
        if (ind == words.length)
            return 0;
        int sn = 0 + max (words,score,freq,ind + 1);
        
        String wd = words[ind];
        int sum = 0;
        boolean flag = true;
        for (int i = 0;i < wd.length();i++) {
            char ch = wd.charAt (i);
            if (freq[ch - 'a'] == 0)
                flag = false;
            freq[ch - 'a']--;
            sum += score[ch - 'a'];
        }
        int sy = 0;
        if (flag) 
            sy = sum + max (words,score,freq,ind + 1);
        for (int i = 0;i < wd.length();i++) {
            char ch = wd.charAt (i);
            freq[ch - 'a']++;
        }
        return Math.max (sn,sy);
    }
    
}
