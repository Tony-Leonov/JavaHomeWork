import java.util.Random;

public class Random_number {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(101);
        System.out.println("rand x: " + x);

    }
}
