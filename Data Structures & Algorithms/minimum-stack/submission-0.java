class MinStack {

      private List<Integer> stack;
     private int index = 0;


    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {

        stack.add(index,val);
        index ++;
    }

    public void pop() {
        index --;
        stack.remove(index);
        
    }

    public int top() {
        return stack.get(index -1 );
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (Integer i:stack){
            min = Math.min(min,i);
        }
        return min;
    }

}
