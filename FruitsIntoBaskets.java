class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int l =0, r =0, max =0 ;
        Map<Integer, Integer> map= new HashMap<>();
        while(r<n)
        {
            if (map.get(fruits[r])==null)
            {
                map.put(fruits[r], 1);
            }
            else
            {
                map.put(fruits[r], map.get(fruits[r])+1);
            }
            if (map.size()>2)
            {
                if (map.get(fruits[l])==1)
                {
                    map.remove(fruits[l]);
                }
                else
                {
                    map.put(fruits[l], map.get(fruits[l])-1);
                }
                l++;
            }
            if (map.size()<=2)
                max = Math.max(max, r-l+1);
            r++;
            
        }
        return max;
    }
}