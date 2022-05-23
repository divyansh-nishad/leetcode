public class decodeXORedarray 
{
    int n = A.length, res[] = new int[n + 1];
    res[0] = first;
    for (int i = 0; i < n; ++i)
        res[i + 1] = res[i] ^ A[i];
    return res;

    
}
