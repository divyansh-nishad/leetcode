public class maximum_product_difference_between_two_numbers 
{
    void merge(int arr[],int l,int m, int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k]=L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k++]=L[i++];
        }
        while(j<n2)
        {
            arr[k++]=R[j++];
        }
    }
    void sort(int arr[], int l, int r)
    {
        if(l<r)
        {
            int m=l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public int maxProductDifference(int[] nums) 
    {
        int l=nums.length;
        sort(nums,0,l-1);
        return ((nums[l-1]*nums[l-2])-(nums[1]*nums[0]));
        
    }
    
}
