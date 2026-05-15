import java.util.Scanner;
import java.util.Random;

public class Main11 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int number = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Guess number between 1 to 100");

        do {
            System.out.print("Enter Guess: ");
            guess = sc.nextInt();

            if (guess > number)
                System.out.println("Too High!");
            else if (guess < number)
                System.out.println("Too Low!");
            else
                System.out.println("Correct Number!");

        } while (guess != number);
    }
}