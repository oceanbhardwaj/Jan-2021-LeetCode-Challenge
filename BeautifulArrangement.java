class Solution {
    int count=0;
    public int countArrangement(int n) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        permute(arr,0,n-1);
        return count;
    }
    public void  permute(int arr[],int l,int r)
    {
        if(l==r)
        {
            if(isValid(arr))
                count++;
        }
        for(int i=l;i<=r;i++)
        {
           arr=swap(arr,l,i);
            permute(arr,l+1,r);
            arr=swap(arr,l,i);//backtrack
        }
        
        
        
    }
    public int[] swap(int arr[],int l,int r)
    {
        int temp=0;
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return arr;
    }
    public boolean isValid(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%(i+1)!=0 && (i+1)%arr[i]!=0)
                return false;
        }
        return true;
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    int count=0;
    public int countArrangement(int n) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        permute(arr,0,n);
        return count;
    }
    public void  permute(int arr[],int l,int r)
    {
        if(l==r)
        {
          
                count++;
        }
        for(int i=l;i<r;i++)
        {
          swap(arr,i,l);
             if((arr[l]%(l+1)==0) || ((l+1)%arr[l]==0))
                permute(arr,l+1,r);
            swap(arr,i,l);//backtrack
        }
        
        
        
    }
    public void swap(int arr[],int l,int r)
    {
        int temp=0;
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
       
    }
   
}