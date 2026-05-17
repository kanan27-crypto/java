import java.util.Random;

public class Main58 {

    public static void main(String[] args) {

        Random rand = new Random();

        int dice = rand.nextInt(6) + 1;

        System.out.println("Dice Number: " + dice);
    }
}