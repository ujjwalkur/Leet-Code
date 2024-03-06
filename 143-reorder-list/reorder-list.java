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
    
     public ListNode middle(ListNode head){
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        
    if(head == null || head.next == null){
        return head;
    }
        
    ListNode prev = null;
    ListNode present = head;
        
    while(present != null){
        ListNode next = present.next;
        present.next = prev;
        prev = present;
        present = next;
    }
        
    return prev;
}

    public void reorderList(ListNode head) {
        
    if(head == null || head.next == null){
        return;
    }
        
    ListNode mid = middle(head);
        
    ListNode fhead = head;
    ListNode shead = reverse(mid.next); // Reverse the second half
        
    mid.next = null; // Break the original list into two halves
        
    while(fhead != null && shead != null){
        ListNode temp1 = fhead.next;
        fhead.next = shead;
        fhead = temp1;
            
        ListNode temp2 = shead.next;
        shead.next = fhead;
        shead = temp2;
    }
  }
}
    






