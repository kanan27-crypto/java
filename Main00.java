import java.util.Scanner;

public class Main00 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("1. Capital of India?");
        System.out.println("a) Delhi");
        System.out.println("b) Mumbai");

        String ans1 = sc.nextLine();

        if (ans1.equalsIgnoreCase("a"))
            score++;

        System.out.println("2. Java is?");
        System.out.println("a) OS");
        System.out.println("b) Programming Language");

        String ans2 = sc.nextLine();

        if (ans2.equalsIgnoreCase("b"))
            score++;

        System.out.println("Final Score: " + score);
    }
}