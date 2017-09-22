package softuni.homeworks;

import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {

        //Write a program that reads three floating point numbers from the console
        // and calculates their result with the following formulae:
        //((a2 + b2) / (a2 – b2))(a + b + c) / √c   (a2 + b2 - c3)(a – b)
        //Then calculate the difference between the average of the three numbers and the
        // average of the two formulae. Average (a, b, c) – Average (f1, f2)

        Locale.setDefault(Locale.ROOT);
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double aUp2 = Math.pow(a, 2);
        double bUp2 = Math.pow(b, 2);
        double cSqare = Math.sqrt(c);
        double cCube = Math.pow(c, 3);
        double f1 = Math.pow(((aUp2 + bUp2) / (aUp2 - bUp2)), (a + b + c) / cSqare);
        double f2 = Math.pow((aUp2 + bUp2 - cCube), (a - b));
        double diff = ((a + b + c) / 3 - (f1 + f2) / 2);

        System.out.printf("%nF1 result: %.2f; F2 result: %.2f; " + "Diff: %.2f", f1, f2, Math.abs(diff));
    }
}
