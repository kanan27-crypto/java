import java.util.Random;
import java.util.Scanner;

public class Main49 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String arr[] = { "Snake", "Water", "Gun" };

        System.out.print("Enter Snake, Water or Gun: ");
        String user = sc.nextLine();

        String computer = arr[rand.nextInt(3)];

        System.out.println("Computer chose: " + computer);

        if (user.equalsIgnoreCase(computer)) {
            System.out.println("Draw");
        }

        else if ((user.equalsIgnoreCase("Snake") && computer.equals("Water")) ||
                (user.equalsIgnoreCase("Water") && computer.equals("Gun")) ||
                (user.equalsIgnoreCase("Gun") && computer.equals("Snake"))) {
            System.out.println("You Win!");
        }

        else {
            System.out.println("Computer Wins!");
        }
    }
}