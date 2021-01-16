/*class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int count=0;
        while(left<=right)
        {
            if(people[left]+people[right]<=limit)
            {left++;
            right--;}
            else
                right--;
            
            count++;
        }
        return count;
    }
}*/
//counting sort
class Solution {
    public int numRescueBoats(int[] people, int limit) {
       
        int count[]=new int[limit+1];
        
        for(int i=0;i<people.length;i++)
        {
            count[people[i]]++;
        }
        
        int index=0;
        
        for(int i=1;i<count.length;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        int arr[]=new int[people.length];
        for(int i=people.length-1;i>=0;i--)
        {
            arr[count[people[i]]-1]=people[i];
            count[people[i]]--;
        }
        for(int i=0;i<people.length;i++)
        {
            people[i]=arr[i];
            
        }
        /*for(int i=0;i<count.length;i++)
        {
            int d=count[i];
            for(int j=0;j<d;j++)
            {
                people[index++]=i;
                //System.out.print(people[index++]+"  ");
            }
        }*/
        
        
        
        
        
        
        
        
        
        
        int left=0;
        int right=people.length-1;
        int count1=0;
        while(left<=right)
        {
            if(people[left]+people[right]<=limit)
            {left++;
            right--;}
            else
                right--;
            
            count1++;
        }
        return count1;
    }
}