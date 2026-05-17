import java.util.Random;

public class Main69 {

    public static void main(String[] args) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";

        Random rand = new Random();

        String password = "";

        for (int i = 0; i < 8; i++) {

            password += chars.charAt(rand.nextInt(chars.length()));
        }

        System.out.println("Generated Password: " + password);
    }
}
