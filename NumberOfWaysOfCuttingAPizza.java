public class NumberOfWaysOfCuttingAPizza {
    public int ways(String[] pizza, int k) {
        if(pizza == null || pizza.length == 0) return 0;
        Map<String, Long> memo = new HashMap<>();
        int tmp = (int)1e9 + 7;
        return (int)(dfs(pizza, memo, k, 0, pizza.length - 1, 0, pizza[0].length() - 1) % tmp);
    }
    
    private long dfs(String[] pizza, Map<String, Long> memo, int k, int rowS, int rowE, int colS, int colE) {
        if(rowS > rowE || colS > colE || k<=0) return 0;
        
        String key = rowS + ":" + rowE + ";" + colS + ":" + colE + ";" + k;
        if(memo.containsKey(key)) {
            return memo.get(key);
        }
        
        long res = 0;

        if(k == 1) {
            res = isValid(pizza, rowS, rowE, colS, colE) ? 1 : 0;
        }else{
            for(int i = rowS; i<=rowE; i++) {
                if(isValid(pizza, rowS, i, colS, colE)) {
                    res += dfs(pizza, memo, k - 1, i + 1, rowE, colS, colE);
                }
            }
            
            for(int i = colS; i<=colE; i++) {
                if(isValid(pizza, rowS, rowE, colS, i)) {
                    res += dfs(pizza, memo, k - 1, rowS, rowE, i + 1, colE);
                }
            }
        }
        
        memo.put(key, res);
        return res;
    }
    
    private boolean isValid(String[] pizza, int rowS, int rowE, int colS, int colE) {
        for(int i = rowS; i<=rowE; i++) {
            for(int j = colS; j<=colE; j++) {
                if(pizza[i].charAt(j) == 'A') return true;
            }
        }
        
        return false;
    }
    
}
