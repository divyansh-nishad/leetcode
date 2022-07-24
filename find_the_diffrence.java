public class find_the_diffrence {
    public char findTheDifference(String s, String t) 
    {
        int res=0;
        for(int i=0;i<s.length();i++)
            res=res^((int)s.charAt(i));
        for(int i=0;i<t.length();i++)
            res=res^((int)t.charAt(i));
        return ((char)res);
    }
    
}
