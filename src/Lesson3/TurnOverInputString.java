package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Java. Algorithms. Lesson 3. Homework.
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 28.02.2019
 */

public class TurnOverInputString {

    private String getStr() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }

    // Переворачиваем строку
    public String turnOver() throws IOException {
        String input = this.getStr();
        char[] inputToCharArray = input.toCharArray();
        char[] resultToCharArray = new char[inputToCharArray.length];

        for (int i= inputToCharArray.length-1, j=0; i>=0; i--, j++) {
            resultToCharArray[j] = inputToCharArray[i];
        }

        return new String(resultToCharArray);
    }


}
