class MinStack {
    private Stack<Integer> data;
    private Stack<Integer> minTracker;

    public MinStack() {
        data = new Stack<>();
        minTracker = new Stack<>();
    }

    public void push(int val) {
        data.push(val);
        if(minTracker.isEmpty() || val <= minTracker.peek()){
            minTracker.push(val);
        } else {
            minTracker.push(minTracker.peek());
        }
    }

    public void pop() {
        data.pop();
        minTracker.pop();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return minTracker.peek();
    }
}