//lps o(n3)
class Solution {
    public String longestPalindrome(String s) {
        int max=1;
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String str=s.substring(i,j);
                if(isPalindrome(str))
                {
                    if(max<=j-i)
                    {
                        max=j-i;
                        s1=str;
                    }
                }
            }
        }
        return s1;
    }
    public boolean isPalindrome(String str)
    {
        if(str.length()==0)
            return true;
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;
            right--;
                
        }
        return true;
    }
}

//o(n2) //dp
class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean dp[][]=new boolean[n][n];
        int start=0;
        int max=1;
        
        //finding for len=1
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    dp[i][j]=true;
                }
            }
        }
        //for len 2
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=true;
                start=i;
                max=2;
            }
        }
        //length >2
        
        for(int k=3;k<=n;k++)//taking length of substring
        {
            for(int i=0;i<=n-k;i++)
            {
                int j=i+k-1;
                if(dp[i+1][j-1] && s.charAt(i)==s.charAt(j) )
                {
                    start=i;
                    max=k;
                    dp[i][j]=true;
                }
            }
        }
        
        
        return s.substring(start,start+max);
        
        
        
    }
}