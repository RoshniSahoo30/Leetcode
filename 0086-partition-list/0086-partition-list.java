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
    public ListNode partition(ListNode head, int x) {

        ListNode lessH = new ListNode(0);
        ListNode bigH = new ListNode(0);
        ListNode less = lessH;
        ListNode big = bigH;

        while(head != null)
        {
            if(head.val<x){
                less.next=head;
                less=less.next;
            }
            else{
                big.next=head;
                big=big.next;
            }
            head=head.next;
        }
        big.next = null;
        less.next = bigH.next;

        return lessH.next;
        
    }
}