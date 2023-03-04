public class MedianOftwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1==null && nums2==null)
        {
            return 0;
        }
        if(nums1==null)
        {
            int n=nums2.length;
            return nums2[(n-1)/2]*0.5+nums2[n/2]*0.5;
        }
        if(nums2==null)
        {
            int n=nums1.length;
            return nums1[(n-1)/2]*0.5+nums1[n/2]*0.5;
        }
        if(nums1.length>nums2.length)
        {
            return findMedianSortedArrays(nums2,nums1);
        }
        int n = nums1.length;
        int m= nums2.length;
        int left=0;
        int right=n;
        while(left<right)
        {
            int i= left+(right-left)/2;
            int j=(n+m)/2-i;
            if(nums1[i]<nums2[j-1])
                left=i+1;
            else
                right = i;
        }
        int first = left;
        int second = (n+m)/2-left;

        int shortLeft = first==0?Integer.MIN_VALUE:nums1[first-1];
        int shortRight = first==n?Integer.MAX_VALUE:nums1[first];

        int longLeft = second==0?Integer.MIN_VALUE:nums2[second-1];
        int longRight = second==m?Integer.MAX_VALUE:nums2[second];

        if((n+m)%2==1)
            return Math.min(shortRight,longRight);
        else
            return Math.max(shortLeft, longLeft) * 0.5 + Math.min(shortRight, longRight) * 0.5;
    }

    
}
