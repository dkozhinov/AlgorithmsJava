package Lesson3;

import java.util.LinkedList;

/**
 * Java. Algorithms. Lesson 3. Homework.
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 28.02.2019
 */

public class Deque {
    private LinkedList<String> deque;
    private int maxDequeSize;

    public Deque(int maxDequeSize) {
        this.maxDequeSize = maxDequeSize;
        this.deque = new LinkedList<>();
    }

    public boolean isEmpty() {
        return (this.deque.size() == 0);
    }

    public boolean isFull() {
        return (this.deque.size() == maxDequeSize);
    }

    public void insertLeft(String value) {
        if (!isFull()) {
            this.deque.addFirst(value);
        }
        else {
            System.out.println("Невозможно добавить элемент. Дек полон.");
        }
    }

    public void insertRight(String value) {
        if (!isFull()) {
            this.deque.addLast(value);
        }
        else {
            System.out.println("Невозможно добавить элемент. Дек полон.");
        }
    }


    public String removeLeft() {
        String value = null;
        if (!isEmpty()) {
            value = this.peekLeft();
            this.deque.removeFirst();
        }
        else {
            System.out.println("Невозможно удалить элемент. Дек пуст.");
        }

        return value;
    }

    public String removeRight() {
        String value = null;
        if (!isEmpty()) {
            value = this.peekRight();
            this.deque.removeLast();
        }
        else {
            System.out.println("Невозможно удалить элемент. Дек пуст.");
        }

        return value;
    }

    public String peekLeft() {
        return this.deque.getFirst();
    }

    public String peekRight() {
        return this.deque.getLast();
    }

    @Override
    public String toString() {
        return "Содержимое дека: " + deque;
    }

}
