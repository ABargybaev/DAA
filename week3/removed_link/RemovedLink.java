class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode placeholder = new ListNode(0);
        placeholder.next = head;
        
        ListNode current = newhead;
        
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return placehodler.next;
    }
}
