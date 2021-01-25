//(nlogn) /o(n) space
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
      List<Integer> total_list=new ArrayList<>();
       for(int i=0;i<lists.length;i++)
        {
          
          ListNode head1=lists[i];
              
                while(head1!=null)
                {
                    total_list.add(head1.val);
                    head1=head1.next;
                }
          
        }
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        Collections.sort(total_list);
        for(int i:total_list)
        {
            dummy.next=new ListNode(i);
            dummy=dummy.next;
        }
        return ans.next;
    }
}

///////////////////////////////////////////////////////////////////////////
//using porutyqueue o(n)space 
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        Comparator co=new Comparator<ListNode>(){
            public int compare(ListNode l1,ListNode l2)
            {
                return l1.val-l2.val;
            }
            
        };
        
        PriorityQueue<ListNode> pq=new PriorityQueue<>(co);
        if(lists.length==0)
            return null;
        for(ListNode l:lists)
        {
            if(l!=null)
            pq.add(l);
        }
        while(!pq.isEmpty())
        {
            dummy.next=pq.poll();
            dummy=dummy.next;
            
            if(dummy.next!=null)
                pq.add(dummy.next);
        }
        
     return ans.next;
      
        
    }
}