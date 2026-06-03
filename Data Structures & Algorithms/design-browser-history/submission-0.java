class BrowserHistory {

    private ListNode curr = null;

    public BrowserHistory(String homepage) {
        ListNode node = new ListNode(homepage);
        curr = node;
    }

    public void visit(String url) {
        ListNode node = new ListNode(url);
        curr.next = node;
        node.prev = curr;
        curr = node;
    }

    public String back(int steps) {
        while (steps != 0 ){
            if(curr.prev == null)
                return  curr.val;
            curr = curr.prev;
            steps --;
        }
        return curr.val;
    }

    public String forward(int steps) {
        while (steps != 0 ){
            if(curr.next == null)
                return  curr.val;
            curr = curr.next;
            steps --;
        }
        return curr.val;
    }


    public class ListNode {
        String val;
        ListNode next;
        ListNode prev;

        ListNode() {
        }

        ListNode(String val) {
            this.val = val;
        }

        ListNode(String val, ListNode next, ListNode prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */