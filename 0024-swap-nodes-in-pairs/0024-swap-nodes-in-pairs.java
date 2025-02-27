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

        ListNode dummy = new ListNode(0, head);
        ListNode prev=dummy, curr=head;
        while(curr!=null && curr.next!=null)
        {
            ListNode n1=curr.next.next;
            ListNode n2=curr.next;
            n2.next=curr;
            curr.next=n1;
            prev.next=n2;
            prev=curr;
            curr=n1;

        }
        return dummy.next;
    }
}