import java.util.Scanner;

public class Main29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Operator (+,-,*,/): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        switch (op) {

            case '+':
                System.out.println("Answer = " + (a + b));
                break;

            case '-':
                System.out.println("Answer = " + (a - b));
                break;

            case '*':
                System.out.println("Answer = " + (a * b));
                break;

            case '/':
                System.out.println("Answer = " + (a / b));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
