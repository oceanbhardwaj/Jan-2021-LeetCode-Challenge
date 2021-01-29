class Solution {
    public String getSmallestString(int n, int k) {
        char ch[]=new char[n];
        Arrays.fill(ch,'a');
        
        int i=ch.length-1;
        k=k-n;
        while(k>0)
        {
            ch[i]=(char)((int)'a'+Math.min(k,25));
            k=k-Math.min(k,25);
            i--;
        }
        return new String(ch);
    }
}