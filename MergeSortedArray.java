class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            a.add(nums1[i]);
        }
        for(int i=0;i<n;i++)
        {
            a.add(nums2[i]);
        }
        Collections.sort(a);
        int index=0;
        for(int i:a)
            nums1[index++]=i;
        
    }
}*/


//////////////////////////////////////////////
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1=m-1;
        int index2=n-1;
        int comb=m+n-1;
        while(index1>=0 && index2>=0)
        {
            if(nums1[index1]>nums2[index2])
            {
                nums1[comb--]=nums1[index1--];
            }
            else
            {
                nums1[comb--]=nums2[index2--];
            }
        }
        while(index2>=0)
        {
            nums1[comb--]=nums2[index2--];
        }
        
        
        
        
        
        
        
        
        
    }
}
////////////////////////////////////////////////
/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1=0;
        int i2=0;
        int index=0;
        int arr[]=new int[m+n];
        while(i1<m || i2<n)
        {
            while(i1<m && i2<n)
            {
                if(nums1[i1]<=nums2[i2])
                {
                    arr[index++]=nums1[i1++];
                    
                }
                else
                    arr[index++]=nums2[i2++];
            }
            while(i1<m)
            {
                arr[index++]=nums1[i1++];
            }
            while(i2<n)
            {
                arr[index++]=nums2[i2++];
            }
        }
        for(int i=0;i<m+n;i++)
        {
            nums1[i]=arr[i];
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}*/

//////////////////////////////////////////
/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++)
        {
            nums1[m++]=nums2[i];
        }
        
        Arrays.sort(nums1);
        
        
        
        
        
        
    }
// }*/

