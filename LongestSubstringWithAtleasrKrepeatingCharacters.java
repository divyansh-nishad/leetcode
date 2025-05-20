class Solution {
    public int longestSubstring(String s, int k) {
        int[] count = new int[26];
        for(int i = 0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
        }
        int max = 0;
        int l = 0;
        boolean flg = true;
        for (int r = 0;r<s.length();r++)
        {
            int i = s.charAt(r)-'a';
            if (count[i]<k && count[i]>0){
                String str = s.substring(l, r);
                max = Math.max(max, longestSubstring(str, k));
                l = r+1;
                flg = false;
            }
        }
        if (flg)
        {
            return s.length();
        }
        else{
            return (int)Math.max(max, longestSubstring(s.substring(l),k));
        }
    }
}