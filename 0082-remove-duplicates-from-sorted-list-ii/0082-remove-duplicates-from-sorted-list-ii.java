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
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null || head.next==null)
        return head;
        ListNode curr=new ListNode(0);
        curr.next=head;
        ListNode temp=curr;
        while(temp.next!=null && temp.next.next!=null)
        {
            if(temp.next.val==temp.next.next.val)
            {
                int nm=temp.next.val;
                while(temp.next!=null && temp.next.val==nm)
                {temp.next=temp.next.next;
                }
            }
            else
            temp=temp.next;
        }
            return curr.next;
    }
}