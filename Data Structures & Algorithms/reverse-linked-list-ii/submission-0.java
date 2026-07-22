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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode current = head;
        int index = 1;
        ListNode breakingPoint = null;
        ListNode prev = null;
        ListNode next = null;
        while(index <= right){
            if(index >= left){
                if(breakingPoint != null){
                    breakingPoint.next = null;
                }
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            else{
                breakingPoint = current;
                current = current.next;
            }
            index++;
        }
        if(breakingPoint != null){
            breakingPoint.next = prev;
        }
        else{
            breakingPoint = prev;
            head = prev;
        }
        
        while(breakingPoint.next != null){
        	breakingPoint = breakingPoint.next;
        }
        breakingPoint.next = current;
        return head;
    }
}