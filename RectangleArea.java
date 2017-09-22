package softuni.homeworks;

import java.math.BigDecimal;
import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

//        Write a program that reads the sides of a rectangle (two integers a and b),
//        calculates and prints the rectangle's area.
//        Format the result to the second digit after the decimal separator.

        Scanner input = new Scanner(System.in);

        BigDecimal a = input.nextBigDecimal();
        BigDecimal b = input.nextBigDecimal();
        a = a.multiply(b);

        System.out.printf("%.2f", a);

    }
}
