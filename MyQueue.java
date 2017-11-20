package xin.jannchie;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> a;
    Stack<Integer> b;
    public MyQueue() {
        // do intialization if necessary
        a = new Stack<Integer>();
        b = new Stack<Integer>();
    }

    /**
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
        while(!b.empty()){
            a.push(b.pop());
        }
        a.push(element);
    }

    /**
     * @return: An integer
     */
    public int pop() {
        // write your code here
        while(!a.empty()){
            b.push(a.pop());
        }
        return b.pop();
    }

    /**
     * @return: An integer
     */
    public int top() {
        // write your code here
        while(!a.empty()){
            b.push(a.pop());
        }
        return b.peek();
    }
}