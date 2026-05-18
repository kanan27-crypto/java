import java.util.Random;
import java.util.Scanner;

public class Main40 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter Your Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Crush Name: ");
        String name2 = sc.nextLine();

        int love = rand.nextInt(101);

        System.out.println(name1 + " ❤ " + name2);
        System.out.println("Love Percentage = " + love + "%");
    }
}