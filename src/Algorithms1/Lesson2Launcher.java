package Algorithms1;

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
public class Lesson2Launcher {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(1000000);
        System.out.println("Текущий размер массива=" + myArray.getSize());
        myArray.insert(99999);
        myArray.delete(9);
        System.out.println("Текущий размер массива=" + myArray.getSize());
        int find_element = 99999;
        System.out.println("Результат поиска элемента=" + find_element + ": " + myArray.find(find_element));
        myArray.insert(find_element);
        System.out.println("Текущий размер массива=" + myArray.getSize());
        System.out.println("Результат поиска элемента=" + find_element + ": " + myArray.find(find_element));

        MyArray myArray2 = new MyArray(100000);
        System.out.print("Выполняем сортировку массива методом выбора...");
        myArray2.sortSelect();

        MyArray myArray3 = new MyArray(100000);
        System.out.print("Выполняем сортировку массива методом пузырька...");
        myArray3.sortBubble();

    }
}
