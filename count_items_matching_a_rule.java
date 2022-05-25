public class count_items_matching_a_rule 
{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int count = 0;
        for(int i = 0 ;i<items.size();i++)
        {
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) 
                count++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) 
                count++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) 
                count++;
        }
        
        return count;
    }
    
}
