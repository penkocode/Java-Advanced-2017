package softuni.homeworks;

import java.util.Scanner;

public class GetFirsOddOrEvenElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arrayAsString = input.nextLine().split("\\s+");
        String[] command = input.nextLine().split("\\s+");
        int[] array = new int[arrayAsString.length];
        int printCount = Integer.parseInt(command[1]);

        for (int i = 0; i < arrayAsString.length; i++) {
            array[i] = Integer.parseInt(arrayAsString[i]);
        }
        switch (command[2]) {
            case "odd":
                for (int element : array) {
                    if (printCount == 0) {
                        break;
                    }

                    if ((element % 2) != 0) {
                        System.out.print(element + " ");
                        printCount--;
                    }
                }
                break;
            case "even":
                for (int element : array) {
                    if (printCount == 0) {
                        break;
                    }

                    if ((element % 2) == 0) {
                        System.out.print(element + " ");
                        printCount--;
                    }
                }
                break;
            default:
                break;
        }
    }
}

