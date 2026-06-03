class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ListNode head = null;
        ListNode tell = null;
        int zeroStudents = 0;
        int oneStudents = 0;
        if (students.length == 0)
            return 0;
        for (int i = 0; i < students.length; i++) {
            ListNode node = new ListNode(students[i]);
            if (i == 0) {
                head = node;
            } else {
                tell.next = node;
                node.prev = tell;
            }
            if (students[i] == 1) {
                oneStudents++;
            } else
                zeroStudents++;
            tell = node;
        }
        tell.next = head;
        head.prev = tell;
        ListNode curr = head;
        int sandwichesIndex = 0;

        while (curr != null) {
            ListNode temp = curr.next;
            if (sandwiches[sandwichesIndex] == curr.val) {
                sandwichesIndex++;
                if (curr.prev == null) {
                    return 0;
                } else if (curr.next == curr.prev) {
                    curr.next.prev = null;
                    curr.next.next = null;
                } else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }

                if (curr.val == 1) {
                    oneStudents--;
                } else
                    zeroStudents--;
            }
            if (sandwichesIndex == sandwiches.length)
                return 0;
            if (oneStudents != 0 && zeroStudents == 0 && sandwiches[sandwichesIndex] == 0)
                return oneStudents;
            if (oneStudents == 0 && zeroStudents != 0 && sandwiches[sandwichesIndex] == 1)
                return zeroStudents;
            curr = temp;
        }
        return 0;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next, ListNode prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}