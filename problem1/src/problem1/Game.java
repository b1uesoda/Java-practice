package problem1;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.print("0과 100 사이의 숫자를 입력:");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println(guess + "은 난수보다 큼");
            } else if (guess < randomNumber) {
                System.out.println(guess + "은 난수보다 작음");
            }
        } while (guess != randomNumber);

        System.out.println(attempts + "번에 맞추었음");
        scanner.close();
    }
}
