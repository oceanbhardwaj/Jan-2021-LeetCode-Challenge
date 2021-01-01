class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int n=arr.length;
        HashMap<Integer,ArrayList<Integer>>h=new HashMap<>();
        
        for(int a[]:pieces)
        {
            h.putIfAbsent(a[0],new ArrayList<>());
            
            for(int j:a)
            {
                h.get(a[0]).add(j);
                
            }
        }
        int array[]=new int[n];
        int d1=0;
        for(int i=0;i<n;)
        {
            if(!h.containsKey(arr[i]))
                return false;
           List<Integer> a1=h.get(arr[i]);
            for(int j:a1)
            { array[d1++]=j;
             System.out.print(j+" ");
             i++;
             }
            
            
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=array[i])
                return false;
        }
        return true;
    }
}