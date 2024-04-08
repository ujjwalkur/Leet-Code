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
 
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0)
            return head;
        
        int length = 1;
        ListNode tail = head;
        
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }
        
        if (k % length == 0)
            return head;
        
        k = k % length;
        tail.next = head;
        
        ListNode newTail = findNthElement(head, length - k);
        head = newTail.next;
        newTail.next = null;
        
        return head;
    }
    
    ListNode findNthElement(ListNode temp, int k) {
        int count = 1;
        while (temp.next != null) {
            if (count == k) {
                return temp;
            }
            temp = temp.next;
            count++;
        }
        return temp;
    }
    
}