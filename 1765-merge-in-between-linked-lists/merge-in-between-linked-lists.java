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
        ListNode temp = list1;
        ListNode aNode = null;
        ListNode bNode = null;
        int index = 0;
        
        while (temp != null) {
            if (index == a - 1) {
                aNode = temp;
            }
            else if (index == b) {
                bNode = temp.next;
                break;
            }
            temp = temp.next;
            index++;
        }
        
        aNode.next = list2;
        ListNode tailList2 = getTail(list2);
        tailList2.next = bNode;
        
        return list1;
    }
    
    public ListNode getTail(ListNode node) {
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }
}

 