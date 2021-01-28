class Solution {
    public int concatenatedBinary(int n) {
        if(n==1)
            return 1;
        long mod=1000000007;
        long max=1;
        for(int i=2;i<=n;i++)
        {
            long d=(long)(Math.log(i)/Math.log(2));
            long x=d+1;
            max=(max<<x)+i;
            max=max%mod;
        }
        return (int)(max%mod);
    }
}