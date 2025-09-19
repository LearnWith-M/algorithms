package org.learnWithM.stacks;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackFromQueueImplementation {

//    Queue FIFO  enqueue, dequeue ( peek, poll, remove, offer, add)
//    Stack LIFO  peek, pop, push


    public static void main(String[] args) {

        Queue<Integer> q1 = new PriorityQueue<>();

        q1.add(2);
        q1.add(3);
        System.out.println("Queue peek value : " + q1.peek());
        System.out.println("Queue poll value : " + q1.poll());
        System.out.println("Queue peek after poll value : " + q1.peek());
        q1.add(4);
        System.out.println(q1);


        Stack<Integer> s1 = new Stack<>();

        s1.push(2);
        s1.push(3);
        System.out.println("Stack peek value : " + s1.peek());
        System.out.println("Stack pop value : " + s1.pop());
        System.out.println("Stack peek after pop value : " + s1.peek());
        s1.push(4);
        System.out.println("Stack peek after add value : " + s1.peek());
        System.out.println(s1);
    }


}
