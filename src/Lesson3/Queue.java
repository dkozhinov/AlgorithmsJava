package Lesson3;

import java.util.LinkedList;

/**
 * Java. Algorithms. Lesson 3. Homework.
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 28.02.2019
 */

public class Queue {

    private LinkedList<String> queue;
    private int maxQueueSize;

    public Queue(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
        this.queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return (this.queue.size() == 0);
    }

    public boolean isFull() {
        return (this.queue.size() == maxQueueSize);
    }

    public void push(String value) {
        if (!isFull()) {
            this.queue.addLast(value);
        }
        else {
            System.out.println("Невозможно добавить элемент. Очередь полна.");
        }
    }

    public String pop() {
        String value = null;
        if (!isEmpty()) {
            value = this.peek();
            this.queue.removeFirst();
        }
        else {
            System.out.println("Невозможно удалить элемент. Очередь пустая.");
        }

        return value;
    }

    public String peek() {
        return this.queue.getFirst();
    }

    @Override
    public String toString() {
        return "Содержимое очереди: " + queue;
    }
}
