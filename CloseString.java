/*class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        if(word1.length()!=word2.length())
            return false;
        Set<Character> s=new HashSet<>();
        for(int i=0;i<word1.length();i++)
        {
            h1.put(word1.charAt(i),h1.getOrDefault(word1.charAt(i),0)+1);
            s.add(word1.charAt(i));
        }
        for(int i=0;i<word2.length();i++)
        {
            h2.put(word2.charAt(i),h2.getOrDefault(word2.charAt(i),0)+1);
            if(s.contains(word2.charAt(i)))
                s.remove(word2.charAt(i));
        }
        ArrayList<Integer> set=new ArrayList<>();
        if(s.size()>0)
            return false;
        for(char i:h1.keySet())
        {
            set.add(h1.get(i));
        }
        int count=set.size();
         for(char i:h2.keySet())
        {
            if(set.contains(h2.get(i)))
               set.remove(set.indexOf(h2.get(i)));
        }
        return set.size()>0?false:true;
           
            
            
            
            
            
            
            
            
            
            
            
        
    }
}*/

class Solution {
    public boolean closeStrings(String word1, String word2) {
    int n=word1.length();
        int m=word2.length();
        if(n!=m)
            return false;
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<n;i++)
        {
            arr1[word1.charAt(i)-'a']++;
        }
         for(int i=0;i<n;i++)
        {
            arr2[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr1[i]==arr2[i]) //checking char
                continue;
            else if(arr1[i]==0 || arr2[i]==0)
                return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<26;i++) //checking freq
        {
            if(arr1[i]!=arr2[i])
                return false;
        }
        
        return true;
        
        
        
        
        
        
    }
}
