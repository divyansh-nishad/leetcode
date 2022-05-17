public class reverse_string {
    public void reverseString(char[] s) 
    {
        int l=s.length;
        for(int i=0;i<l/2;i++)
        {
            char t=s[i];
            s[i]=s[l-i-1];
            s[l-i-1]=t;
        }
    }
}
