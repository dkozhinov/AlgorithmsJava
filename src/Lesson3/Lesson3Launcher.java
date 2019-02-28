package Lesson3;


import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Java. Algorithms. Lesson 3. Homework.
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 28.02.2019
 */

public class Lesson3Launcher {

    public static void main(String[] args) throws IOException {
        Stack stack = new Stack(5);
        System.out.println("\nPush to stack 6 elements.");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("F");
        System.out.println(stack.toString());
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println("Push to stack 1 element: X.");
        stack.push("X");
        System.out.println(stack.toString());
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println("Pop from stack: " + stack.pop());
        System.out.println(stack.toString());

        Queue queue = new Queue(5);
        System.out.println("\nPush to queue 6 elements.");
        queue.push("A");
        queue.push("B");
        queue.push("C");
        queue.push("D");
        queue.push("E");
        queue.push("F");
        System.out.println(queue.toString());
        System.out.println("Pop from queue: " + queue.pop());
        System.out.println("Pop from queue: " + queue.pop());
        System.out.println("Push to queue 1 element: X.");
        queue.push("X");
        System.out.println(queue.toString());
        System.out.println("Pop from queue: " + queue.pop());
        System.out.println("Pop from queue: " + queue.pop());
        System.out.println("Pop from queue: " + queue.pop());
        System.out.println("Pop from queue: " + queue.pop());
        System.out.println("Pop from queue: " + queue.pop());
        System.out.println(queue.toString());


        PriorityQueue priorityQueue = new PriorityQueue(5);
        System.out.println("\nPush to priorityQueue 6 elements.");
        priorityQueue.push(9);
        priorityQueue.push(2);
        priorityQueue.push(3);
        priorityQueue.push(2);
        priorityQueue.push(7);
        priorityQueue.push(8);
        System.out.println(priorityQueue.toString());
        System.out.println("Pop from priorityQueue: " + priorityQueue.pop());
        System.out.println("Pop from priorityQueue: " + priorityQueue.pop());
        System.out.println("Push to priorityQueue 1 element: 5.");
        priorityQueue.push(5);
        System.out.println(priorityQueue.toString());
        System.out.println("Pop from priorityQueue: " + priorityQueue.pop());
        System.out.println("Pop from priorityQueue: " + priorityQueue.pop());
        System.out.println(priorityQueue.toString());
        System.out.println("Pop from priorityQueue: " + priorityQueue.pop());
        System.out.println("Pop from priorityQueue: " + priorityQueue.pop());
        System.out.println("Pop from priorityQueue: " + priorityQueue.pop());
        System.out.println(priorityQueue.toString());


        System.out.println("\nПереворачиваем строку:");
        String input;
        TurnOverInputString turnOverInputString = new TurnOverInputString();
        while (true) {
            input = turnOverInputString.turnOver();
            if (input.equals("")) break;
            System.out.println("TurnOverInputString=" + input);
        }
    }


}
