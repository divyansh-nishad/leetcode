public class FruitsIntoBasket {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int res=0,i=0;
        for(int j=0;j<fruits.length;j++)
        {
            hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);
            while(hm.size()>2)
            {
                hm.put(fruits[i],hm.get(fruits[i])-1);
                if(hm.get(fruits[i])==0)
                    hm.remove(fruits[i]);
                i++;
            }
        res= Math.max(res,j-i+1);
        }
    return res;
    }
    
}
