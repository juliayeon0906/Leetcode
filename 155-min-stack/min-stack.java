class MinStack {
    Stack<Integer> stack; // -> all regular stack value
    Stack<Integer> minStack; // -> only the minimum value

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        
        if(minStack.isEmpty() || minStack.peek() >= stack.peek()) {
            minStack.push(val); // means that val = minimum
        }
    }
    
    public void pop() {
        int removed = stack.pop();
        if(removed == minStack.peek()) { // check if the removed element is also contained in the min Stack
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek(); // get the top element in the stack
    }
    
    public int getMin() {
        return minStack.peek(); // get the top element from the minimum stack.
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */