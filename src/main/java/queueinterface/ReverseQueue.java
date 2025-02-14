package queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        // create Queue
        Queue<Integer> queue = new LinkedList<>();
        // add element to queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        // call method to reverse queue
        reverseQueue(queue);
        // print queue
        System.out.println(queue);
    }

    // method to reverseQueue
    public static <T> void reverseQueue(Queue<T> queue){
        // create stack to reverse Queue
        Stack<T> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll()); // put all data of queue into stack
        }
        // store data again into queue
        while (!stack.isEmpty()){
            queue.offer(stack.pop());
        }
    }
}
