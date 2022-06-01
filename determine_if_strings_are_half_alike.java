public class determine_if_strings_are_half_alike 
{
    public int cvow(String s)
    {
        String check="aeiouAEIOU";
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(check.indexOf(s.charAt(i))!=-1)
                c++;
        }
        return c;
    }
    
    public boolean halvesAreAlike(String s) 
    {
        int l=s.length();
        int tot=cvow(s);
        if(tot%2==1)
            return false;
        int fh=cvow(s.substring(0,l/2));
        int sh=cvow(s.substring(l/2,l));
        if(fh==sh)
        return true;
        return false;
        
    }
    
}
