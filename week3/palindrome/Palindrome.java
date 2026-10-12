class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode secondHalfHead = reverseList(slow);
        ListNode firstHalfPtr = head;
        ListNode secondHalfPtr = secondHalfHead;
        
        boolean isPal = true;
        while (secondHalfPtr != null) {
            if (firstHalfPtr.val != secondHalfPtr.val) {
                isPal = false;
                break;
            }
            firstHalfPtr = firstHalfPtr.next;
            secondHalfPtr = secondHalfPtr.next;
        }
        return isPal;
    }
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}
