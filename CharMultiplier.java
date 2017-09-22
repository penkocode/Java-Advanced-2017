package softuni.homeworks;

import java.util.Scanner;

public class CharMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstString = input.next();
        String secondString = input.next();
        int minStringCount;
        int sum = 0;

        if (firstString.length() == secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                sum += firstString.charAt(i) * secondString.charAt(i);
            }
            System.out.println(sum);
        } else if (firstString.length() < secondString.length()) {
            minStringCount = firstString.length();
            for (int i = 0; i < minStringCount; i++) {
                sum += firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = minStringCount; i < secondString.length(); i++) {
                sum += secondString.charAt(i);
            }
            System.out.println(sum);
        } else {
            minStringCount = secondString.length();
            for (int i = 0; i < minStringCount; i++) {
                sum += firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = minStringCount; i < firstString.length(); i++) {
                sum += firstString.charAt(i);
            }
            System.out.println(sum);
        }
    }
}
