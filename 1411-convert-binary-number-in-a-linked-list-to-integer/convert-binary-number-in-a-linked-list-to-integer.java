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
    public int getDecimalValue(ListNode head) {
     
        ListNode node = head;
        int value = 0;
        
        while(node != null){
           value =  (value * 2) + node.val;
            // value *= 2 + node,val
            
            node = node.next;
        }
        
        return value;
        
    }
}