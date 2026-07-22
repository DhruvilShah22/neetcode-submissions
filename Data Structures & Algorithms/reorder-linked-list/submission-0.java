class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        int mid = (count + 1) / 2;

        current = head;
        for (int i = 1; i < mid; i++) {
            current = current.next;
        }

        ListNode second = current.next;
        current.next = null;

        ListNode prev = null;
        while (second != null) {
            ListNode nextTemp = second.next;
            second.next = prev;
            prev = second;
            second = nextTemp;
        }

        ListNode first = head;
        ListNode reversed = prev;

        while (reversed != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = reversed.next;

            first.next = reversed;
            reversed.next = temp1;

            first = temp1;
            reversed = temp2;
        }
    }
}
