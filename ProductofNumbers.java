package softuni.homeworks;

import java.math.BigInteger;
import java.util.Scanner;

public class ProductofNumbers {
    public static void main(String[] args) {

//        Write a program that calculates the product of all numbers in the interval [n..m] by given n and m:

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int a = n;
        int b = m;

        BigInteger product = BigInteger.ONE;


        do {
            BigInteger number = new BigInteger("" + a);
            product = product.multiply(number);
            a++;
        } while (a <= b);
        System.out.printf("product[%d..%d] = %d\n", n, m, product);

    }
}
