public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 1;
        int hi = arr.length-1;
        while(lo<hi)
        {
            int mid = lo + (hi-lo)/2;
            if(arr[mid]<arr[mid+1])
                lo=mid+1;
            else
                hi=mid;
        }
        return lo;
    }
    
}
