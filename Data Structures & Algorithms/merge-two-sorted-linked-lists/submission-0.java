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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode head =null;
        ListNode curr =null;
        if(list1 ==null && list2 ==null){
            return null;
        }
        while (list1 !=null && list2 !=null){
            ListNode temp;
            if(list1.val < list2.val){
                temp = list1;
                list1 = list1.next;
            }else {
                temp = list2;
                list2 = list2.next;
            }
            if(head == null){
                head = temp;
            }else {
                curr.next = temp;
            }
            curr = temp;
        }
        ListNode temp;
        if(list1!=null){
            temp = list1;
        } else {
            temp =list2 ;
        }
        if(head == null){
            head = temp;
        }else {
            curr.next = temp;
        }
        return  head;
    }
}