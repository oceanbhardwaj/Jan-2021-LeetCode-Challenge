class Solution {
    TreeNode ans=null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
       dfs(cloned,target,original);
        return ans;
    }
        
    public void dfs(final TreeNode cloned, final TreeNode target,final TreeNode original)
    {
        if(cloned==null)
            return;
        
            if(original==target)
                ans= cloned;
            dfs(cloned.left,target,original.left);
            dfs(cloned.right,target,original.right);
            
        
        
    }
}