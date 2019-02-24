package Algorithms1;

import java.util.Random;

/**
 * Java. Algoritms. Lesson 2. Homework.
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 24.02.2019
 */

// 1. Создать массив большого размера (миллион элементов).
// 2. Написать методы удаления, добавления, поиска элемента массива.
// 3. Заполнить массив случайными числами.
// 4. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
public class MyArray {

    private int size;
    private int[] myArrayInt;
    private Random random;
    private final int  RANGE_OF_RANDOM_NUMBERS = 10; // Размер диапазона для заполнения массива случайными числами [0-9]

    public MyArray(int size) {
        this.size = size;
        myArrayInt = new int[size];
        fillArray();
    }

    private void fillArray() {
        random = new Random();
        for(int i=0; i< size; i++) {
            myArrayInt[i] = random.nextInt(RANGE_OF_RANDOM_NUMBERS);
        }
    }

}
