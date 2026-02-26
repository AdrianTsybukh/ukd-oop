import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(0, 100);
        int maxAttempts = 5;
        int guess = 0;
        int attempt = 1;
        do {
            System.out.printf("Enter your guess. Attempt №%d: ", attempt);
            guess = sc.nextInt();
            if(guess > randomNumber) {
                System.out.println("Your guess is greater.");
            } else if (guess < randomNumber) {
                System.out.println("Your guess is less.");
            } else if (guess == randomNumber){
                System.out.println("You won!");
                System.exit(0);
            }
            attempt++;


        } while(attempt != maxAttempts + 1);

        System.out.printf("You lost. The number was %d", randomNumber);
    }
}