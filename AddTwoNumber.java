class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        
     
       
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        int sum=0;
        int carry=0;
        while(l1!=null || l2!=null)
        {
            if(l1==null)
                l1=new ListNode(0);
            
            if(l2==null)
                l2=new ListNode(0);
            sum=l1.val+l2.val+carry;
            carry=0;
            if(sum>=10)
            {
                carry=sum/10;
                sum=sum%10;
                 //dummy.next=new ListNode(carry);
            }
            //else
            dummy.next=new ListNode(sum);
            dummy=dummy.next;
            
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            
            
                
        }
        if(carry>0)
            dummy.next=new ListNode(carry);
    ListNode ans1=ans.next;
        return ans1;
        
        
        
        
        
        
        
        
    }
   
}