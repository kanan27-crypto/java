import java.util.Random;

public class Main96 {

    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("Lottery Numbers:");

        for (int i = 1; i <= 6; i++) {

            int num = rand.nextInt(50) + 1;

            System.out.print(num + " ");
        }
    }
}