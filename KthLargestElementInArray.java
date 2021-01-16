//O(nlogn) o(1)
/*class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n-k];
        
    }
}*/

//o(nlogn) o(n) //max heap
/*class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            pq.add(nums[i]);
        }
        int ans=0;
        while(k>0)
        {
            ans=pq.poll();
            k--;
        }
        return ans;
        
        
    }
}*/
//using min heap
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<n;i++)
        {
        pq.add(nums[i]);
            if(pq.size()>k)
                pq.poll();
        }
        return pq.peek();
        
        
    }
}

