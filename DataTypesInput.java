import java.util.Scanner;

public class DataTypesInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Character input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Float input
        System.out.print("Enter a float number: ");
        float f = sc.nextFloat();

        // Boolean input
        System.out.print("Enter a boolean value (true/false): ");
        boolean b = sc.nextBoolean();

        // Printing values
        System.out.println("\n--- Output ---");
        System.out.println("Integer value: " + num);
        System.out.println("Character value: " + ch);
        System.out.println("Float value: " + f);
        System.out.println("Boolean value: " + b);
    }
}
