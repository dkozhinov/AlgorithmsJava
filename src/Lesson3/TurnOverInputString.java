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
        String inputString = this.getStr();
        String outputString = "";
        int inputStringLength = inputString.length();
        System.out.println("inputStringLength=" + inputStringLength);

        if (inputStringLength == 0) return outputString;

        Stack stack = new Stack(inputStringLength);

        for (String s : inputString.split("")) {
            stack.push(s);
        }

        for(int i = 0; i < inputStringLength; i++) {
            outputString += stack.pop();
        }

        return outputString;
    }


}
