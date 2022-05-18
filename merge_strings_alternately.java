public class merge_strings_alternately {
    public String mergeAlternately(String word1, String word2) 
    {
        int l1=word1.length();
        int l2=word2.length();
        String k="";
        int i=0;int j=0;
        while(i<l1 && j<l2)
        {
            k=k+word1.charAt(i++)+word2.charAt(j++);
        }
        while(i<l1)
        {
            k=k+word1.charAt(i++);
            
        }
        while(j<l2)
        {
            k=k+word2.charAt(j++);
        }
        return k;
        
    }
    
}
