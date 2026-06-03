class MyLinkedList {

     private ListNode head = null;
    private ListNode tell = null;

    public MyLinkedList() {

    }

    public int get(int index) {
        if(head == null )
            return -1;
        int curIndex = 0;
        ListNode temp  =head;
        while (temp !=null) {
            if (curIndex == index) {
               return temp.val;
            }
            temp = temp.next;
            curIndex++;
        }
        return -1; 
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        if(head == null){
            head =node;
            tell = node;
        }else {
            head.prev = node;
            node.next = head;
            head = node;
        }

    }

    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        if(head == null){
            head =node;
            tell = node;
        }else {
            tell.next = node;
            node.prev = tell;
            tell = node;
        }
    }

    public void addAtIndex(int index, int val) {
        ListNode node = new ListNode(val);
        if(head == null){
            head =node;
            tell = node;
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        int curIndex = 0;
        ListNode temp  =head;
        while (temp !=null){
            if(curIndex == index){
                node.next =temp;
                node.prev = temp.prev;
                temp.prev.next = node;
                temp.prev = node;
                return;
            }
            temp = temp.next;
            curIndex++;
        }
        addAtTail(val);
    }

    public void deleteAtIndex(int index) {
        if (head == null){
            return;
        }
        if(index == 0){
            head = head.next;
            head.prev = null;
        }
        int curIndex = 0;
        ListNode temp  =head;
        while (temp !=null){
            if(curIndex == index){
                if(temp.next == null){
                    tell = temp.prev;
                }else {
                    temp.next.prev = temp.prev;
                }
                temp.prev.next = temp.next;

            }
            temp = temp.next;
            curIndex++;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode() {
        }

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

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */