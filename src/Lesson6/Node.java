package Lesson6;

/**
 * Java. Algorithms. Lesson 6. Homework.
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 16.03.2019
 */

public class Node {
    private int key;
    private int level;   // Номер уровня узла
    private int height;  // Высота дерева в узле
    private int balance; // Баланс в узле
    private Node leftChild;
    private Node rightChild;

    public Node(int key) {
        this.key = key;
        this.leftChild = null;
        this.rightChild = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public void display (){
        System.out.println ("Key: " + this.key + " (level=" + this.level + ")" + " (height=" + this.height + ")"
                            + " (balance=" + this.balance + ")");
    }
}
