class MinStack {
    Stack<Integer>first=new Stack<>();
    Stack<Integer>sec=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        first.push(value);
        if(sec.isEmpty()){
            sec.push(value);
        }
        else{
            sec.push(Math.min(value,sec.peek()));
        }
    }
    
    public void pop() {
        first.pop();
        sec.pop();
    }
    
    public int top() {
        return first.peek();
    }
    
    public int getMin() {
        return sec.peek();
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