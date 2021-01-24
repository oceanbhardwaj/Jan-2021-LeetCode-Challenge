class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                h.putIfAbsent(i-j,new ArrayList<>());
               h.get(i-j).add(mat[i][j]);
            }
        }
        for(int i:h.keySet())
        {
            List<Integer> l1=h.get(i);
          Collections.sort(l1);
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                int d=i-j;
                mat[i][j]=h.get(i-j).get(0);
                h.get(i-j).remove(0);
            }
        }
        return mat;
        
        
    }
}