class Solution {
    public int countVowelStrings(int n) {
        int countdp[]={1,1,1,1,1};
        for(int i=2;i<=n;i++)
        {
            for(int j=countdp.length-2;j>=0;j--)
            {
                countdp[j]=countdp[j]+countdp[j+1];
            }
        }
        int sum=0;
        for(int i=0;i<countdp.length;i++)
        {
            sum=sum+countdp[i];
        }
        return sum;
    }
}
//PATTERN SUM OF PREVIOS TWO
      a        e       i       o        u
n==1  1        1        1       1       1 
n==2  4+1=5        3+1=4          2+1=3        1+1=2        1
n==3   10+5=15               6+4=10              3+3=6                2+1=3        1