package softuni.homeworks;

import java.util.Scanner;

public class ModifyAbit {

    public static void main(String[] args) {

//        We are given a positive integer number n, a position p and a bit value v (v=0 or 1).
//        Write a program that modifies n to hold the value v at the position p from the binary
//        representation of n while preserving all other bits in n.
//        Print the decimal representation of the resulting number.

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int p = input.nextInt();
        int v = input.nextInt();

        if (v == 0) {
            int mask = ~(1 << p);
            int result = n & mask;
            System.out.println(result);

        } else {
            int mask = 1 << p;
            int result = n | mask;
            System.out.println(result);
        }
    }
}
