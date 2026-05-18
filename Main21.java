import java.util.Scanner;

public class Main21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = "Java is fun";

        System.out.println("Type this sentence:");
        System.out.println(sentence);

        long start = System.currentTimeMillis();

        String userInput = sc.nextLine();

        long end = System.currentTimeMillis();

        long time = (end - start) / 1000;

        if (userInput.equals(sentence)) {
            System.out.println("Correct!");
            System.out.println("Time Taken: " + time + " seconds");
        }

        else {
            System.out.println("Wrong Typing");
        }
    }
}