class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return null;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
            ListNode head1=null;
        ListNode head2=null;
        ListNode head=null;
       
        if(l1.val<=l2.val)
        {head1=l1;
         head=l1;
         head1=head1.next;
         head2=l2;}
        else
        {head1=l2;
          head=l2;
         head1=head1.next;
         head2=l1;}
         ListNode ans=head;
        while(head1!=null || head2!=null)
        {
            while(head1!=null && head2!=null)
            {
                if(head1.val<=head2.val)
                {
                    head.next=head1;
                    head=head.next;
                    head1=head1.next;
                }
                else if(head2.val<head1.val)
                {
                    head.next=head2;
                    head=head.next;
                    head2=head2.next;

                }
            }
            if(head1!=null)
            {head.next=head1;
             head1=null;}
            if(head2!=null)
            {head.next=head2;
             head2=null;}
                
                
                
        }
        return ans;
        
    }
}