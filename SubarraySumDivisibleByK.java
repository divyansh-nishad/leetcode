public class SubarraySumDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        // create an array to store the count of remainder for each index
        int [] remainderArray = new int[k];
 // initialize the first element of remainder array as 1 
        remainderArray[0] = 1;
        // initialize sum and count as 0
        int sum = 0, count = 0;
        // iterate through the given array
        for(int a : nums){
            // update the sum by adding current element to previous sum
            sum = (sum + a) % k;
            // if sum is negative, add k to make it positive
            if(sum < 0) sum += k;
            // add the count of subarrays with same remainder to the count
            count += remainderArray[sum];
            // increment the count of current remainder
            remainderArray[sum]++;
        }
        // return the final count
        return count;
    }
    
}
