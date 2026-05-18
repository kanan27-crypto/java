import java.util.Random;
import java.util.Scanner;

public class Main27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String Truth[] = {
                "Who is your crush?",
                "Biggest fear?",
                "Most embarrassing moment?"
        };

        String Dare[] = {
                "Dance for 10 seconds",
                "Sing a song",
                "Talk like a robot"
        };

        System.out.print("Choose Truth or Dare: ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Truth")) {

            int t = rand.nextInt(Truth.length);

            System.out.println(Truth[t]);
        }

        else {

            int d = rand.nextInt(Dare.length);

            System.out.println(Dare[d]);
        }
    }
}