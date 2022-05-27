public class longest_common_prefix
{
    public String longestCommonPrefix(String[] strs) 
    {
        String pr="";
        int max=0;
        String str=strs[0];
        for(int i=0;i<str.length();i++)
        {
            pr=pr+str.charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].indexOf(pr)!=0)
                    return(str.substring(0,max));;
            }
            max=max+1;
        }
        return(str.substring(0,max));
    }
    
}
