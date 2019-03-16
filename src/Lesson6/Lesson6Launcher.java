package Lesson6;


/**
 * Java. Algorithms. Lesson 6. Homework.
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 16.03.2019
 */

public class Lesson6Launcher {

    private static int iteration = 20;

    public static void main(String[] args) {
        Tree tree = new Tree(4);
        tree.showTree();
        if (tree.GetBalancedTree()) {
            System.out.println("Дерево сбалансировано, т.е. для каждой его вершины высота её двух поддеревьев различается не более чем на 1!");
        } else {
            System.out.println("Дерево несбалансировано, т.е. для каждой его вершины высота её двух поддеревьев различается более чем на 1!");

        }
        int counterNotBalancedTree=0;
        for (int i=0; i < iteration; i++) {
            tree = new Tree(4);
            if (!tree.GetBalancedTree()) counterNotBalancedTree++;
        }
        System.out.println("Несбалансированных бинарных деревьев= " + counterNotBalancedTree + " или "
                            + (float)(counterNotBalancedTree*100/iteration)+ "%");
    }

}