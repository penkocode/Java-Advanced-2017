package softuni.homeworks;

        import java.util.Scanner;

public class ExtraxtBitFromInt {

    public static void main(String[] args) {

//        Write a program that extracts from given positive integer n the value of given bit at index p.
// The bits are counted from right to left, starting from bit 0.

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int p = input.nextInt();

        int mask = n >> p;
        int bit = mask & 1;

        System.out.println(bit);

    }
}