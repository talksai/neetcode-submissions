class Solution {
    public int calPoints(String[] operations) {
        int total  = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< operations.length; i++){
            if(operations[i].equalsIgnoreCase("D")){
                total = total + stack.push(2*stack.peek());
            }else if(operations[i].equalsIgnoreCase("+")){
                int temp = stack.pop();
                int newTotal = temp + stack.peek();
                stack.push(temp);
                total = total + stack.push(newTotal);
            }else if(operations[i].equalsIgnoreCase("C")){
                total = total - stack.pop();
            }else {
                total = total + stack.push(Integer.parseInt(operations[i]));
            }
        }
        return total;
    }
}