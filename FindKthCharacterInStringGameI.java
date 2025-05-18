class Solution {
    public char kthCharacter(int k) {
       String str = "a";
       String output = create(str, k);
       return output.charAt(k-1);
    }

    private static String create(String str, int n)
    {
        if (str.length()>=n)
            return str;

        int l = str.length();

        String append = "";

        for (int i=0;i<l;i++)
        {
            char ch = str.charAt(i);

            if (ch == 'z')
            {
                append = append + "a";
            }
            else
            {
                append = append + (char)(ch+1);
            }
        }

        return create(str+append, n);
    }
}