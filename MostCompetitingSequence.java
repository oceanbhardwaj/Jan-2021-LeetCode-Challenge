/*class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> s=new Stack<>();
        int arr[]=new int[k];
        int d=k-1;
         k=nums.length-k;
        for(int i=0;i<nums.length;i++)
        {
            while(!s.isEmpty() && s.peek()>nums[i] && k>0)
            { s.pop();
            
            k--;}
             s.push(nums[i]);
            }
        
        while(!s.isEmpty() && k>0)
        {
            s.pop();
            k--;
        }
        while(!s.isEmpty())
        {
            arr[d--]=s.pop();
        }
        return arr;
        
    }
}*/

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
     int n=nums.length;
        int i=0;
        int j=0;
        int arr[]=new int[k];
        int index=0;
        while(i<n && k>0)
        {
            int min=find_min(i,n-k,nums); //min index
                i=min+1;
            k--;
            arr[index++]=nums[min];
        }
        
        return arr;
        
        
        
        
        
    }
    public int find_min(int i,int j,int nums[])
    { int minival=Integer.MAX_VALUE;
     int mini=0;
        for(int k=i;k<=j;k++)
        {
            if(nums[k]<minival)
            {
                mini=k;
                minival=nums[k];
            }
        }
        return mini;
    }
}


