public class NamingACompany {
    public long distinctNames(String[] ideas) {
        Set<String>[] count = new Set[26];
        for (int i = 0; i < 26; i++) {
            count[i] = new HashSet<>();
        }
        for (String s : ideas) {
            count[s.charAt(0) - 'a'].add(s.substring(1));
        }
        int same[][] = new int[26][26];
        for (int i = 0; i < 26; i++) {
            for (String s : count[i]) {
                for (int j = i + 1; j < 26; j++) {
                    if (count[j].contains(s))
                        same[i][j]++;
                }
            }
        }
        long res = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                res += (count[j].size() - same[i][j]) * (count[i].size() - same[i][j]) * 2;
            }
        }
        return res;
    }

}
