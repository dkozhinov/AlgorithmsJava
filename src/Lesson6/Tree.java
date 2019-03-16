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
    private final int ALLOWED_INSERT_ERROR = 9;
    private boolean balancedTree;


    public Tree(int allowedLevel) {
        this.allowedLevel = allowedLevel;
        this.balancedTree = true;
        createTree();
        // Вычисление высоты в во всех узлах дерева
        calculateHeightInNode(root);
        // Вычисление баланса в всех узлах дерева
        calculateBalanceInNode(root);
    }


    public boolean GetBalancedTree() {
        return balancedTree;
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

    //обход узлов в отсортированном порядке
    private void roundTreeLeftToRight(Node node){
        if ( node != null ){
            roundTreeLeftToRight( node.getLeftChild());
            node.display();
            roundTreeLeftToRight( node.getRightChild());
        }
    }

    // обход узлов в порядке: вершина, левое поддерево, правое поддерево
    private void roundTreeUpToDown(Node node){
        if ( node != null ){
            node.display();
            roundTreeUpToDown( node.getLeftChild());
            roundTreeUpToDown( node.getRightChild());
        }
    }


    // Нахождение высоты конкретного узла
    // Высота дерева - это длина пути от корня до самого глубокого node в дереве.
    // Дерево с корнем (root)имеет высоту=0
    // если нет node, вы возвращаете -1, который отменяет +1.
    private int getHeightInNode(Node node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = getHeightInNode(node.getLeftChild());
        int rightHeight = getHeightInNode(node.getRightChild());

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    // Вычисление высоты в узлах дерева
    // Если на входе указать узлом root, то во всех узлах дерева
    private void calculateHeightInNode(Node node){
        if ( node != null ){
            node.setHeight(getHeightInNode(node));
            calculateHeightInNode( node.getLeftChild());
            calculateHeightInNode( node.getRightChild());
        }
    }



    // Вычисление баланса конкретного узла
    private int getBalanceInNode(Node node)
    {
        int balance =   ((node.getRightChild()!=null) ? node.getRightChild().getHeight() : -1) -
                        ((node.getLeftChild() !=null) ? node.getLeftChild().getHeight()  : -1);
        if (balance < -1 || balance > 1) {
            balancedTree = false;
        }
        return  balance;
    }

    // Вычисление баланса в узлах дерева
    // Если на входе указать узлом root, то во всех узлах дерева
    private void calculateBalanceInNode(Node node){
        if ( node != null ){
            node.setBalance(getBalanceInNode(node));
            calculateBalanceInNode( node.getLeftChild());
            calculateBalanceInNode( node.getRightChild());
        }
    }




}

