package softuni.homeworks;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        //     Write a program that reads 3 points in the plane (with integer x and y as coordinates),
        //     calculates and prints the area of the triangle composed by these 3 points.
        //   Round the result to a whole number. In case the three points do not form a triangle, print "0" as result

        Scanner input = new Scanner(System.in);

        int aX = input.nextInt();
        int aY = input.nextInt();
        int bX = input.nextInt();
        int bY = input.nextInt();
        int cX = input.nextInt();
        int cY = input.nextInt();

        int area = Math.abs(((aX) * (bY - cY) + bX * (cY - aY) + cX * (aY - bY))) / 2;

        if (area == 0) {
            System.out.println(0);
        } else {
            System.out.println(area);
        }
    }
}
