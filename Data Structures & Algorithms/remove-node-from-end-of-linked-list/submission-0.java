/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        if(count == n){
            return head.next;
        }
        current = head;
        count -= n;
        ListNode prev = current;
        while(--count >= 0){
            prev = current;
            current = current.next;
        }
        if(current != null){
            prev.next = current.next;
        }
                
        return head;
    }
}
