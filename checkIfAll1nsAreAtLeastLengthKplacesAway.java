/*class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                a.add(i);
        }
        for(int i=1;i<a.size();i++)
        {
            if(a.get(i)-a.get(i-1)-1<k)
                return false;
                
        }
        return true;
    }
}*/

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count=k;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                if(count<k)
                    return false;
                    count=0;
            }
            else
                count++;
        }
        
        return true;
        
        
        
        
    }
}