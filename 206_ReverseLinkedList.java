// 206 - Reverse Linked List
// Time Complexity: O(n)
// Space Complexity: O(1)
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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode temp=head;
        ListNode prev=null;
        ListNode nextNode=null;
        while(temp!=null){
            nextNode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextNode;
        }
        head=prev;
        return head;
    }
    
}
