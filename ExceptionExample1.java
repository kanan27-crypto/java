import java.util.Scanner;

public class ExceptionExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        int result = a / b;
        System.out.println("Result: " + result);

        System.out.println("Program continues...");
    }
}