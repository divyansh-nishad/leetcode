public class gcd_of_the_array {
    public int findGCD(int[] nums) {
        int max = 0;
        int min = 1001;
    
        // Find the min and max from array
        for(int e : nums){
            max = Math.max(max,e);
            min = Math.min(min,e);
        }
        return gcd(min, max);
    }
	
	private int gcd(int a, int b) {
		  if (b == 0) return a;
		  return gcd(b, a % b);
    }
    
}
