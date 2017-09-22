package softuni.homeworks;

public class Lottery {
    public static void main(String[] args) {

//        Print all combinations from TOTO 3/10 lottery (like 6/49 but with less combinations):

        for (int i = 1; i <= 8; i++) {
            for (int y = i+1; y <= 9; y++) {
                for (int k = y+1; k <= 10; k++) {
                    System.out.printf("%d %d %d\n", i, y, k);
                }
            }

        }


    }
}
