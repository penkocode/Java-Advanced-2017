package softuni.homeworks;

import java.util.Scanner;

public class Greatings {
    public static void main(String[] args) {

//        Read two strings as an input – the first and last name of a person. Print a greeting in the following format:
//        "Hello, " + {firstName} {lastName} + "!" , where if a name is missing, replace it with five stars "*":


        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String lastName = input.nextLine();

        if (firstName.isEmpty()) {
            firstName = "*****";
        }
        if (lastName.isEmpty()) {
            lastName = "*****";
        }


        System.out.printf("Hello, %s %s!", firstName, lastName);
    }
}
