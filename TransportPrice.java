package softuni.homeworks;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {

//        A student travels n kilometers using only one type of transport based on the distance that he will travel:
//•	Taxi: Initial tax: 0.70 USD. Daytime cost: 0.79 USD/km. Night time cost: 0.90 USD/km.
//•	Bus: Day / Night tariff: 0.09 USD/km. For at least 20 kilometers.
//•	Train: Day / Night tariff: 0.06 USD/km. For at least 100 kilometers.
//                Write a program that calculates the price of the trip by a given distance and time of day.
//                Format the output to the second digit after the decimal separator.


        Scanner input = new Scanner(System.in);

        int distance = Integer.valueOf(input.next());
        String dayOrNight = input.next();

        double taxiRate = 0.90;

        double busPrice = 0.09;

        double trainPrice = 0.06;

        if (dayOrNight.equals("day")) {
            taxiRate = 0.79;

        }
        if (distance < 20) {
            System.out.printf("%.2f", 0.70 + (taxiRate * distance));
        } else if (distance < 100) {
            System.out.printf("%.2f", busPrice * distance);
        } else {
            System.out.printf("%.2f", trainPrice * distance);
        }


    }
}
