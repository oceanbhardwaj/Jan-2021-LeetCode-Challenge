class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        if(n<=1)
            return 0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(!h.containsKey(k-nums[i]))
                h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            else if(h.containsKey(k-nums[i]))
            {
                count++;
                h.put(k-nums[i],h.get(k-nums[i])-1);
                if(h.get(k-nums[i])==0)
                    h.remove(k-nums[i]);
            }
        }
        return count;
    }
}

/*class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int count=0;
        while(left<right)
        {
            if(nums[left]+nums[right]==k)
            {count++;
             left++;
             right--;}
            else if(nums[left]+nums[right]>k)
                right--;
            else 
                left++;
        }
        return count;
        
        
        
    }
}*/