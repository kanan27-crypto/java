import java.util.Random;

public class Main25 {

    public static void main(String[] args) {

        String moods[] = {
                "😊 Happy",
                "😴 Sleepy",
                "😎 Cool",
                "😭 Sad",
                "🔥 Motivated"
        };

        Random rand = new Random();

        int index = rand.nextInt(moods.length);

        System.out.println("Today's Mood:");
        System.out.println(moods[index]);
    }
}