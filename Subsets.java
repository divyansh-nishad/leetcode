import java.util.*;
public class Subsets{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> up=new ArrayList<>();
        generate(nums,0,new ArrayList<>(),up);
        return up;
    }
    public void generate(int[] nums,int i,List<Integer> p,List<List<Integer>> up){
        if(i==nums.length){
            up.add(new ArrayList(p));
            return;
        }
        generate(nums,i+1,p,up);
        p.add(nums[i]);
        generate(nums,i+1,p,up);
        p.remove(p.size()-1);
    }
}