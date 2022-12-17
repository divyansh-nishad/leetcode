public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String str="", k="";
        s=s+' ';
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                if(k.length()==0)
                continue;
                str = k + " " + str;
                k="";
            }
            else
            k=k+ch;
        }
        return str.trim();
    }
}
