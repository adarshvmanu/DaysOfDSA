class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode curr = prev.next;
        while(prev.next!=null)
        {
            curr = prev.next;
            if(prev.val == curr.val)
                prev.next = curr.next;
            else
            prev = prev.next;
        }
        if(prev == prev.next)
            curr = null;
        return head;
    }
}