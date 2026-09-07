class Solution {
    public ListNode swapPairs(ListNode head) {
           ListNode swap = new ListNode(0);
           swap.next=head;
           ListNode curr=swap;
           while(curr.next != null && curr.next.next!=null){
            ListNode first=curr.next;
            ListNode second=curr.next.next;

            //swap
            first.next=second.next;
            second.next=first;
            curr.next=second;
            curr=first;
           }
           return swap.next;
    }
}