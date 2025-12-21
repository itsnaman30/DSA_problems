
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)return head;

        ListNode dummy =new ListNode(-1);
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = dummy;

        while(a != null && b != null){
            c.next = b;
            a.next = b.next;
            b.next = a;
            c = a;
            a = a.next;
            if(a != null)b = a.next;
        }
        return dummy.next;


        // ListNode d1 = new ListNode(-1);
        // ListNode t1 = d1;
        // ListNode d2 = new ListNode(-1);
        // ListNode t2 = d2;
        // ListNode t = head;

        //  while(t != null){
        //      ListNode next = t.next;
        //     t.next = null;   
        //     t1.next = t;
        //     if(t != null)t = t.next;
        //     t1 = t1.next;

        //       if (t != null) {
        //         next = t.next;
        //         t.next = null;
        //     t2.next = t;
        //     if(t != null)t = t.next;
        //     t2 = t2.next;
        //       }
        // }

        // ListNode p1 = d1.next;
        // ListNode p2 = d2.next;

        // ListNode d3 = new ListNode(-1);
        // ListNode c = d3;

        // while(p1 != null && p2 != null){
           
        //     c.next = p2;
        //     c = c.next;
        //     p2 = p2.next;

        //     c.next = p1;
        //     c = c.next;
        //     p1 = p1.next;

        // }
        //  if (p1 != null) c.next = p1;
        // return d3.next;
           
          
     
    }
}