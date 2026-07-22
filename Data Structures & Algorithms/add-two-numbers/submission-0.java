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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = l1.val + l2.val;
        int carry = 0;
        if(val > 9){
            val = val % 10;
            carry = 1;
        }
        ListNode current = new ListNode(val);
        ListNode retCurrent = current;
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null && l2 != null){
            val = l1.val + l2.val + carry;
            if(val > 9){
                val = val % 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            current.next = new ListNode(val);
            l1 = l1.next;
            l2 = l2.next;
            current = current.next;
        }
        while(l1 != null){
            val = l1.val + carry;
            if(val > 9){
                val = val % 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            current.next = new ListNode(val);
            current = current.next;
            l1 = l1.next;
        }
        while(l2 != null){
            val = l2.val + carry;
            if(val > 9){
                val = val % 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            current.next = new ListNode(val);
            current = current.next;
            l2 = l2.next;
        }
        if(carry > 0){
            current.next = new ListNode(carry);
        }
        return retCurrent;
    }
}