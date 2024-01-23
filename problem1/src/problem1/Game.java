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
            System.out.print("0�� 100 ������ ���ڸ� �Է�:");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println(guess + "�� �������� ŭ");
            } else if (guess < randomNumber) {
                System.out.println(guess + "�� �������� ����");
            }
        } while (guess != randomNumber);

        System.out.println(attempts + "���� ���߾���");
        scanner.close();
    }
}
