package Lesson5;

/**
 * Java. Algorithms. Lesson 5. Homework.
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 14.03.2019
 */


public class Exponentiation {

    public static int run (int number, int degree) {
        //System.out.println("degree=" + degree);
        if (degree == 1) return number;
        return run(number, --degree) * number;
    }
}
