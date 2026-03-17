
import java.util.Stack;

class Solution {
   public ListNode reverseList(ListNode head) {
       if (head == null) return null;

       Stack<ListNode> stack = new Stack<>();
       ListNode current = head;
       
       // Push all nodes onto the stack
       while (current != null) {
           stack.push(current);
           current = current.next;
       }
       
       // Pop the first item to be the new head
       ListNode newHead = stack.pop();
       current = newHead;
       
       // Pop the rest of the items to build the reversed list
       while (!stack.isEmpty()) {
           current.next = stack.pop();
           current = current.next;
       }
       
       // Important: sever the last node's original next pointer to prevent cycles
       current.next = null; 
       
       return newHead;
   }
} 
    

