public class number_of_1_bits {
    public int hammingWeight(int n) {
        int c=0;
        while(n!=0)
        {
            n=(n&(n-1));
            c++;
        }
        return c;
    }
    
}
