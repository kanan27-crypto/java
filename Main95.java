import java.util.Scanner;

public class Main95 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seats = 5;

        while (true) {

            System.out.println("\nAvailable Seats: " + seats);

            System.out.print("Book How Many Seats? ");
            int book = sc.nextInt();

            if (book <= seats) {

                seats -= book;

                System.out.println("Booking Successful");
            }

            else {
                System.out.println("Not Enough Seats");
            }

            if (seats == 0) {

                System.out.println("House Full");
                break;
            }
        }
    }
}