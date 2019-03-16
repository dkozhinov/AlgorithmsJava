package Lesson6;

import java.util.Random;

/**
 * Java. Algorithms. Lesson 6. Homework.
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 16.03.2019
 */

public class Tree {

    private Node root;
    private Random random;
    // Заданная разрешенное число уровней (глубина уровней) построения дерева
    private int allowedLevel;
    // Максимально возможное число ошибок при вставке элемента в дерево, при заданной разрешенной глубине
    // учитывается при вставке элемента когда высота дерева превышает разрешенную (allowedLevel)
    private final int ALLOWED_INSERT_ERROR = 2;

    public Tree(int allowedLevel) {
        this.allowedLevel = allowedLevel;
        createTree();
    }


    public void showTree() {
        //roundTreeLeftToRight(root);
        roundTreeUpToDown(root);
    }


    private boolean insert (int key , int allowedLevel) {
        Node node = new Node (key);
        int level=0;  // Уровень дерева

        if (root == null) {
            node.setLevel(level);
            root = node;
            return true;
        }

        Node current = root;

        while (true) {
            if (++level > allowedLevel) {
                return false;
            }
            node.setLevel(level);

            if ( key < current.getKey() ){
                if (current.getLeftChild() == null){
                    current.setLeftChild(node);
                    return true;
                } else {
                    current = current.getLeftChild();
                }
            } else {
                if (current.getRightChild() == null){
                    current.setRightChild(node);
                    return true;
                } else {
                    current = current.getRightChild();
                }
            }

        }

    }


    //Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -100 до 100
    private void createTree() {
        int counterInsertError = 0;
        random = new Random();

        while (counterInsertError < ALLOWED_INSERT_ERROR) {
            if (!insert(100 - random.nextInt(200), allowedLevel)) {
                counterInsertError++;
            };

        }

    }

    private void roundTreeLeftToRight(Node node){
        if ( node != null ){
            roundTreeLeftToRight( node.getLeftChild());
            node.display();
            roundTreeLeftToRight( node.getRightChild());
        }
    }

    private void roundTreeUpToDown(Node node){
        if ( node != null ){
            node.display();
            roundTreeLeftToRight( node.getLeftChild());
            roundTreeLeftToRight( node.getRightChild());
        }
    }

}

