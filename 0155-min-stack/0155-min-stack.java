class MinStack {
    
    public Stack<Integer>first;
    public Stack<Integer>second;

    public MinStack() {
        first=new Stack<>();
        second=new Stack<>();
    }
    
    public void push(int value) {
        first.push(value);
        if(second.isEmpty()){
            second.push(value);
            }
        else{
            second.push(Math.min(value,second.peek()));
        }
    }
    
    public void pop() {
        first.pop();
        second.pop();
        }
    
    public int top() {
        return first.peek();
    }
    
    public int getMin() {
        return second.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */