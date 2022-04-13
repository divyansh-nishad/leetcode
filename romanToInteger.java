class romanToInteger
{
    public static int romanToInt(String s) 
    {
        int[] arnum={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] arst={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int num=0;
        int len=arst.length-1;
        while(len>=0)
        {
            if(s.startsWith(arst[len]))
            {
                int del=arst[len].length();
                //System.out.println(del);
                s=s.substring(del,s.length());
                num=num+arnum[len];
                //System.out.println(arst[len]);
            }
            else
            {
                len--;
            }
        }
        return num;
    }
}