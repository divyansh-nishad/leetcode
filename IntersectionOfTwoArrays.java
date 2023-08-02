import java.util.HashSet;
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet(); 
        HashSet<Integer> res = new HashSet(); 
    
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
    
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])) res.add(nums2[i]);
        }
    
        int[] arr = new int[res.size()];        
        int jtr = 0;
        for (int i : res)  
            arr[jtr++] = i; 
    
        return arr;
    }
    
}
