class MyStack {

     private Queue<Integer> q1 = new ArrayDeque<>();

    public MyStack() {
    }

    public void push(int x) {
        q1.offer(x);
    }

    public int pop() {
        int size = q1.size();
        for(int i =1; i<size; i++){
            q1.offer(q1.poll());
        }
        return q1.poll();
    }

    public int top() {
        int size = q1.size();
        for(int i =1; i<size; i++){
            q1.offer(q1.poll());
        }
        int res = q1.poll();
        q1.offer(res);
        return res;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */