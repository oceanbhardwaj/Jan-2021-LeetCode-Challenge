class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        HashMap<Integer,Integer> h=new LinkedHashMap<>();
        ListNode curr=head;
        while(curr!=null)
        {
            h.put(curr.val,h.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        for(int i:h.keySet())
        {
            if(h.get(i)==1)
            {
                dummy.next=new ListNode(i);
                dummy=dummy.next;
            }
        }
        return ans.next;
        
    }
}

////////////////////////////////////////
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(head!=null)
        {
            int count=0;
            ListNode start=head;
            while(head!=null && head.val==start.val)
            {
                count++;
                head=head.next;
            }
           
            if(count==1)
            {
                dummy.next=start;
                dummy=dummy.next;
            }

        }
        dummy.next=null;
        return ans.next;
        
    }
}