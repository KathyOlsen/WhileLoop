import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber1, secretNumber2, guess = 0;//guess is initialized to 0

        secretNumber1 = 123;
        secretNumber2 = 5;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();

        while (( guess != secretNumber1) && (guess != secretNumber2))
        {
            System.out.println("\nYou are wrong. Try again.");
            System.out.println("Enter the number: ");
            guess = keyboard.nextInt();
        }

        System.out.println("You are correct. You win a prize!");
        keyboard.close();
    }
}