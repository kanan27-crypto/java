public class ExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b; // Exception occurs here
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("This block always executes.");
        }

        System.out.println("Program continues...");
    }
}
