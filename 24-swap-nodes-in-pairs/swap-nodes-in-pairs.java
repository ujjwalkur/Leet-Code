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
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode temp = new ListNode(-1);
        
        temp.next = head;
        ListNode curr = temp;
        
        while(curr.next != null && curr.next.next != null){
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            
            first.next = second.next;
            second.next = first;
            curr.next = second;
            curr = first;
        }
        
        return temp.next;
       
    }
}