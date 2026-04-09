import java.util.Scanner;

public class ShiftArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using Left Shift
        int multiplyBy2 = num << 1; // num * 2
        int multiplyBy4 = num << 2; // num * 4

        // Using Right Shift
        int divideBy2 = num >> 1; // num / 2
        int divideBy4 = num >> 2; // num / 4

        System.out.println("Original Number = " + num);
        System.out.println("Multiply by 2 (<<1) = " + multiplyBy2);
        System.out.println("Multiply by 4 (<<2) = " + multiplyBy4);
        System.out.println("Divide by 2 (>>1) = " + divideBy2);
        System.out.println("Divide by 4 (>>2) = " + divideBy4);
    }
}
