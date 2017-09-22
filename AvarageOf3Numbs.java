package softuni.homeworks;

import java.util.Scanner;

public class AvarageOf3Numbs {
    public static void main(String[] args) {

       /* Write program that reads three numbers. Print the average of the three, formatted to the second digit after the decimal point.*/

        Scanner input = new Scanner(System.in);

        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble();
        double thirdNum = input.nextDouble();

        double avg = (firstNum + secondNum + thirdNum) / 3;

        System.out.printf("%.2f", avg);
    }
}
