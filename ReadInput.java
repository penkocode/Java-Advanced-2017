package softuni.homeworks;

import java.util.Scanner;

public class ReadInput {
    /*Write a program that reads:
•	Two strings from the first line
•	Three Integers which may be on multiple lines
•	A string from the next line
    Print the output in the following format {firstWord} {secondWord} {thirdWord} {sumOfNumbers}.
    The sum of numbers should be an integer.*/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstWord = input.next();
        String secondWord = input.next();
        int firstInt = input.nextInt();
        int secondInt = input.nextInt();
        int thirdInt = input.nextInt();
        int sum = firstInt + secondInt + thirdInt;
        String thirdWord = input.next();


        System.out.printf("%s %s %s %s", firstWord, secondWord, thirdWord, sum);
    }
}
