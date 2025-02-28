// Add an element to the top of Stack
    void push(int x) {
        Mainstack.push(x);
        if(minstack.empty() || x<= minstack.top()){
            minstack.push(x);
        }
        // code here
    }

    // Remove the top element from the Stack
    void pop() {
        if(Mainstack.empty()){
            return ;
        }
        if(Mainstack.top() == minstack.top()){
            minstack.pop();
        }
        Mainstack.pop();
        // code here
    }

    // Returns top element of the Stack
    int peek() {
        if(Mainstack.empty()){
            return -1;
        }
        return Mainstack.top();
        // code here
    }

    // Finds minimum element of Stack
    int getMin() {
        
        if(minstack.empty()){
            return -1;
        }
        
        return minstack.top();
        // code here
    }
