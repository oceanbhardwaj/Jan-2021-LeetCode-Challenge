class Solution {
     class Pair
     {
         int x;
         
         int y;
         TreeNode node;
         Pair(int x,int y, TreeNode node)
         {
             this.x=x;
             this.y=y;
            this.node=node;
         }
     }
   TreeMap<Integer,PriorityQueue<Pair>>pq;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return null;
        
        Comparator co=new Comparator<Pair>()
        {
            public int compare(Pair p1,Pair p2)
            {
                if(p1.y==p2.y)
                    return p1.node.val-p2.node.val;
                return p1.y-p2.y;
            }
        };
        pq=new TreeMap<>();
        
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,0,root));
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int xx=p.x;
            int yy=p.y;
            TreeNode n=p.node;
           // TreeNode n=new TreeNode(node);
            pq.putIfAbsent(xx,new PriorityQueue<>(co));
            pq.get(xx).add(p);
            if(n.left!=null)
                q.add(new Pair(xx-1,yy+1,n.left));
            if(n.right!=null)
                q.add(new Pair(xx+1,yy+1,n.right));
        }
        
        for(int ele:pq.keySet())
        {
            PriorityQueue<Pair> p1=pq.get(ele);
            ArrayList<Integer> a=new ArrayList<>();
            while(!p1.isEmpty())
            {
                a.add(p1.poll().node.val);
            }
            res.add(a);
            
        }
        
        return res;
        
        
        
        
        
    }
    
}