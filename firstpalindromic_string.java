public class firstpalindromic_string {
    public boolean checkPal(String str)
    {
        String s="";
        String u="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            s=s+ch;
            u=ch+u;
        }
        if(s.equals(u))
            return true;
        else
            return false;
        
    }
    public String firstPalindrome(String[] words) 
    {
        String k="";
        for(int i=0;i<words.length;i++)
        {
            if(checkPal(words[i]))
            {
                k=words[i];
                break;
            }
        }
        return k;
        
    }
}
