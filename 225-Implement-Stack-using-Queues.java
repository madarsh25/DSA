class MyStack {
    Queue<Integer> queue = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        int s = queue.size();
        queue.offer(x);
        for (int i = 0; i < s; i++){
            queue.offer(queue.peek());
            queue.poll();
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        if (queue.size() != 0){
            return false;
        }
        return true;
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