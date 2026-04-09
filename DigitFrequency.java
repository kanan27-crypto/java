import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        int[] freq = new int[10]; // Array to store frequency of digits 0-9

        while (num > 0) {
            int digit = (int) (num % 10); // Get last digit
            freq[digit]++; // Increase frequency
            num = num / 10; // Remove last digit
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
