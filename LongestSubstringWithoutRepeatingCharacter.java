class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        HashSet<Character> h=new HashSet<>();
        int max=0;
        int count=0;
        int j=0;
        for(int i=0;i<s.length();)
        {
            if(!h.contains(s.charAt(j)))
            {
             h.add(s.charAt(j));
                j++;
                max=Math.max(max,j-i);
                
            }
            else
            { 
                h.remove(s.charAt(i++));
                
            }
            if(j>=s.length())
                break;
             
        }
            return max;
    }
}
/////////////////////////////////////////////////////////////////
/*class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        int max=0;
        for(int i=0;i<s.length();i++)
        { HashSet<Character> h=new HashSet<>();
            for(int j=i;j<s.length();j++)
            { 
                if(!h.contains(s.charAt(j)))
                {h.add(s.charAt(j));
                 max=Math.max(h.size(),max);}
                else
                    break;
            }
        }
        return max;
        
        
        
        
        
        
        
        
        
        
        
    }
}*/