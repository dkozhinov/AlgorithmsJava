package Lesson3;

import java.util.LinkedList;

/**
 * Java. Algorithms. Lesson 3. Homework.
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 28.02.2019
 */

public class Stack {

    private LinkedList<String> stack;
    private int maxStackSize;

    public Stack(int maxStackSize) {
        this.maxStackSize = maxStackSize;
        this.stack = new LinkedList<>();
    }

    public boolean isEmpty() {
        return (this.stack.size() == 0);
    }

    public boolean isFull() {
        return (this.stack.size() == maxStackSize);
    }

    public void push(String value) {
        if (!isFull()) {
            this.stack.addLast(value);
        }
        else {
            System.out.println("Невозможно добавить элемент. Стек полон.");
        }
    }

    public String pop() {
        String value = null;
        if (!isEmpty()) {
            value = this.peek();
            this.stack.removeLast();
        }
        else {
            System.out.println("Невозможно удалить элемент. Стек пустой.");
        }

        return value;
    }

    public String peek() {
        return this.stack.getLast();
    }

    @Override
    public String toString() {
        return "Содержимое стека: " + stack;
    }
}