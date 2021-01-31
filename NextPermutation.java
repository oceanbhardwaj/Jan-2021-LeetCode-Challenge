class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        
            
            
        int start=-1;
        int end=-1;
       for(int i=n-1;i>0;i--)
       {
           if(nums[i-1]<nums[i])
           {
               start=i-1;
               break;
           }
       }
        //System.out.println(start);
        for(int i=n-1;i>=0;i--)
       {
           if(start!=-1 && nums[i]>nums[start])
           {
               end=i;
               break;
           }
       }
        if(start!=-1 && end!=-1)
        {
            swap(nums,start,end);
            reverse(nums,start+1,n-1);

        }
        else
            reverse(nums,0,n-1);
        //return nums;
    }
    public int[] swap(int nums[],int start,int end)
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        return nums;
        
    }
    public int[] reverse(int nums[],int start,int end)
    {
        while(start<=end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }
        return nums;
    }
}