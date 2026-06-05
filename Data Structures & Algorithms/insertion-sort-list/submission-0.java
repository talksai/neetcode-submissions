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
    public ListNode insertionSortList(ListNode head) {
           ListNode temp = head;
        int index = 0;
        Map<Integer, ListNode> indexMap = new HashMap<>();
        while (temp!=null){
            indexMap.put(index,temp);
            temp = temp.next;
            index++;
        }
        if(head == null)
            return head;
       for (int i =1 ;i< index; i++){
           for (int j =i; j>0 ;j-- ){
               ListNode curr = indexMap.get(j);
               ListNode prev = indexMap.get(j-1);
               if(curr.val< prev.val){
                   int tempval = curr.val;
                   curr.val= prev.val;
                   prev.val = tempval;
               }

           }
       }
        return head;
    }
}