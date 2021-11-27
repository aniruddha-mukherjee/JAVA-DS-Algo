package com.data.structure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StacknQueue {
    public static void stackTest(){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        queueUsingStack();
    }

    private static void queueUsingStack() {
        MyQueue myQueue = new MyQueue();
        myQueue.add(40);
        myQueue.add(30);

        System.out.println(myQueue.poll());

        myQueue.add(20);
        myQueue.add(10);

        while(myQueue.isNotEmpty())
            System.out.println(myQueue.poll());

    }

    private static void queueTest() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(51);
        queue.add(50);
        queue.add(52);
        queue.add(500);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    static class MyQueue{
        private Stack<Integer> stack1;
        private Stack<Integer> stack2 ;

        public MyQueue() {
            this.stack1 = new Stack<>();
            this.stack2 = new Stack<>();
        }


        public void add(Integer i) {
            stack1.push(i);
        }


        public int poll() {
           while(!stack1.isEmpty())
               stack2.push(stack1.pop());

           int x = stack2.pop();

           while(!stack2.isEmpty())
               stack1.push(stack2.pop());

           return x;
        }


        public int peek() {
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());

            int x = stack2.peek();

            while(!stack2.isEmpty())
                stack1.push(stack2.pop());

            return x;
        }

        public boolean isNotEmpty(){
            return !stack1.isEmpty();
        }
    }
}
