/*class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1="";
        String res2="";
        for(int i=0;i<word1.length;i++)
        {
            res1=res1+word1[i];
        }
         for(int i=0;i<word2.length;i++)
        {
            res2=res2+word2[i];
        }
        return res1.equals(res2);
        
    }
}*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1=word1.length;
        int n2=word2.length;
        int w1=0;
        int w2=0;
        int p1=0;
        int p2=0;
        while(w1<n1 && w2<n2)
        {
            String curr1=word1[w1];
            String curr2=word2[w2];
            
            if(curr1.charAt(p1)!=curr2.charAt(p2))
                return false;
            if(p1<curr1.length()-1)
                p1++;
            else
            {
                p1=0;
                w1++;
            }
            if(p2<curr2.length()-1)
                p2++;
            else
            {
                p2=0;
                w2++;
            }
            
            
            
            
        }
        
       return w1==n1 && w2==n2; 
        
        
        
        
        
    }
}