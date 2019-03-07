package Lesson3;

import java.util.LinkedList;

/**
 * Java. Algorithms. Lesson 3. Homework.
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 28.02.2019
 */

public class PriorityQueue  {

    private LinkedList<Integer> priorityQueue;
    private int maxPriorityQueueSize;

    public PriorityQueue(int maxPriorityQueue) {
        this.maxPriorityQueueSize = maxPriorityQueue;
        this.priorityQueue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return (this.priorityQueue.size() == 0);
    }

    public boolean isFull() {
        return (this.priorityQueue.size() == maxPriorityQueueSize);
    }

    public void push(Integer value) {
        boolean flag = false;

        if (isEmpty()) {
            this.priorityQueue.addFirst(value);
            return;
        }

        try {
            if (!isFull()) {
                int i;
                for (i = 0; i < this.priorityQueue.size(); i++) {
                    if (value < priorityQueue.get(i)) {
                        flag = true;
                        break;
                    }
                }

                if (flag) this.priorityQueue.add(i, value);
                else      this.priorityQueue.addLast(value);
            }
            else {
                System.out.println("Невозможно добавить элемент. Очередь полна.");
            }

        } catch (IndexOutOfBoundsException e) {
                System.out.println("Невозможно добавить элемент. Ошибка при работе с индексами.");
        }
    }


    public Integer pop() {
        Integer value = null;
        if (!isEmpty()) {
            value = this.peek();
            this.priorityQueue.removeFirst();
        }
        else {
            System.out.println("Невозможно удалить элемент. Очередь пустая.");
        }

        return value;
    }

    public Integer peek() {
        return this.priorityQueue.getFirst();
    }

    @Override
    public String toString() {
        return "Содержимое очереди: " + priorityQueue;
    }

}
