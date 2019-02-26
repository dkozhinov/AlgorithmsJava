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

    private int size;           // Текущий размер массива
    private int sizeMaximum;    // Первоначально заданный размер массива
    private int[] myArrayInt;
    private Random random;
    private final int  RANGE_OF_RANDOM_NUMBERS = 1000; // Размер диапазона для заполнения массива случайными числами [0-9]

    public MyArray(int size) {
        this.sizeMaximum = size;
        this.myArrayInt = new int[size];
        fillArray();
    }

    // Метод удаления элемента из массива
    public void delete(int value){
        int i = 0;
        boolean flagFound = false;

        if (this.size <= 0) {
            return;
        }

        for (i = 0 ; i < this.size; i++){
            if (this.myArrayInt[i] == value){
                flagFound = true;
                break;
            }
        }

        for (int j = i; j < this.size - 1; j++){
            this.myArrayInt[j] = this.myArrayInt[j + 1];
        }

        if (flagFound) {
            this.size--;
        }
    }


    // Метод добавления элемента в массив
    public void insert ( int value ){
        if (size < sizeMaximum) {
            this.myArrayInt[this.size] = value;
            this.size++;
        }
        else {
            System.out.println("Текущий размер массива привысил первоначально заданный размер= " + sizeMaximum + " !");
        }
    }

    public int getSize() {
        return this.size;
    }

    // Метод обычного поиска (простым перебором) элемента в массиве
    public boolean find(int value) {
        for ( int i = 0; i < this.size; i++) {
            if ( this.myArrayInt[i] == value) {
                return true ;
            }
        }
        return false ;
    }

    // Вывод массива в консоль
    public void print() {
        for ( int i = 0; i < this.size; i++) {
            System.out.print(this.myArrayInt[i] + ", ");
        }
    }

    // Сортировка методом выбора
    public void sortSelect(){
        int out, in, mark;
        long startTime = System.nanoTime();

        for (out = 0; out < this.size; out++){
            mark = out;
            for (in = out + 1; in < this.size; in++){
                if (this.myArrayInt[in]< this.myArrayInt[mark]){
                    mark = in;
                }
            }
            change (out , mark);
        }
        System.out.println(" время выполнения алгоритма= " + (long)(System.nanoTime() - startTime)/1000000 + " милисекунд.");
    }


    // Сортировка методом пузырька
    public void sortBubble(){
        int out, in;
        long startTime = System.nanoTime();

        for (out = this.size - 1; out >= 1 ; out--) {
            for (in = 0 ; in < out; in++) {
                if (this.myArrayInt[in] > this.myArrayInt[in + 1]) {
                    change(in, in + 1 );
                }
            }
        }
        System.out.println(" время выполнения алгоритма= " + (long)(System.nanoTime() - startTime)/1000000 + " милисекунд.");
    }


    private void change( int a, int b){
        int tmp = this.myArrayInt[a];
        this.myArrayInt[a] = this.myArrayInt[b];
        this.myArrayInt[b] = tmp;
    }

    // Метод для первоначального заполнения массива
    private void fillArray() {
        random = new Random();
        for (int i=0; i< sizeMaximum; i++) {
            insert(random.nextInt(RANGE_OF_RANDOM_NUMBERS));
        }
    }

}
