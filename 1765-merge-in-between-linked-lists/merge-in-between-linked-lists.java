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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        for(int i = 1; i < a; i++) {
            head = head.next;
        }
        ListNode temp = head;
        for(int i = 0; i < b-a+2; i++) {
            temp = temp.next;
        }
        ListNode temp2 = list2;
        while(temp2.next != null) {
            temp2 = temp2.next;
        }
        head.next = list2;
        temp2.next = temp;
        return list1;
    }
}
 