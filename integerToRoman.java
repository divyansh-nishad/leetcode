class integerToRoman {
    public String intToRoman(int num) 
    {
        String arst[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int arnum[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int c=num;
        String k="";
        int len=arnum.length;
        len--;
        while(c>0)
        {
            if(arnum[len]>c)
            {
                len--;
            }
            else
            {
                c=c-arnum[len];
                k=k+arst[len];
            }
        }
        return k;
    }
}
