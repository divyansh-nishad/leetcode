public class fibonacci_number {
    public int fib(int n) 
    {
        //THIS IS DONE BY RECURSION BUT IT IS NOT EFFICIENT
        // if(n==0 || n==1)
        //     return n;
        // else
        //     return (fib(n-1)+fib(n-2));
        if(n<= 1)
            return n;
        
		int a=0,b=1;
		while(n > 1)
		{
			int c=a+b;
			a=b;
			b=c;
            n--;
		}
        return b;
        
    }
}
