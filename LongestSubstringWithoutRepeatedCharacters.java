public class LongestSubstringWithoutRepeatedCharacters {
    public int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int l = s.length();
            int i = 0, j = 0;
            int ans = 0;
            while(j < l) {
                if(!map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), 1);
                } else {
                    map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
                }
                if(map.size() == (j - i + 1)) {
                    ans = Math.max(ans, j - i + 1);
                } else {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if(map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
            return ans;
        }
    }
