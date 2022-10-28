public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] alt = Arrays.copyOf(strs, strs.length);
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            strs[i] = str;
        }
        List<List<String>> list = new ArrayList<List<String>>();
        for (int i = 0; i < strs.length; i++) {
            List<String> arr = new ArrayList<String>();
            if (!(strs[i] == null))
                arr.add(alt[i]);
            else
                continue;
            for (int j = i + 1; j < strs.length; j++) {
                if (strs[i].equals(strs[j])) {
                    arr.add(alt[j]);
                    strs[j] = null;
                }
            }
            list.add(arr);
            strs[i] = "";
        }
        return list;
    }
}
