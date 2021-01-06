class Solution {             //bruteforce
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            h.add(arr[i]);
        }
        for(int i=1;i<=Integer.MAX_VALUE;i++)
        {
            if(!h.contains(i))
                count++;
            if(count==k)
                return i;
        }
        return -1;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int missing=compute(arr[n-1],n);
        
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            missing=compute(arr[mid],mid+1);
            if(missing>=k)
                right=mid-1;
            else
                left=mid+1;
        }
        if(right==-1)
            return k;
        return arr[right]+k-compute(arr[right],right+1);
            
        
        
        
        
    }
    public int compute(int a,int b)
    {
        return a-b;
    }
}