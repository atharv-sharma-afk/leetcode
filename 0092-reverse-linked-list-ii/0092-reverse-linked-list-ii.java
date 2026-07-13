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
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // If the list is empty or we don't need to reverse anything
        if (head == null || left == right) {
            return head;
        }

        // 1. Create a dummy node to easily handle left == 1 edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // 2. Move `prev` to the node strictly BEFORE position `left`
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // 3. `curr` will always point to the node at position `left`
        ListNode curr = prev.next;

        // 4. In-place reversal: pull `nextNode` to the front of the sublist
        for (int i = 0; i < right - left; i++) {
            ListNode nextNode = curr.next;
            
            // Rewire the connections to move nextNode to immediately after prev
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        // The real head is always right after our dummy node!
        return dummy.next;
    }
}
