package tryprograms;
import java.util.Scanner;
import java.util.Random;

public class task3
{
	public static void main(String ag[])
	{
		int maxguess=10;
		int range=4000;
		Random ran = new Random();
		int num = ran.nextInt(range) +1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Guess a Number Game!");
        System.out.println("I'm thinking of a number between 1 and 4000.");

        int numGuesses = 0;
        int guess;

        while (numGuesses < maxguess) {
            System.out.print("Enter your guess: ");
            guess = scan.nextInt();
            numGuesses++;

            if (guess == num) {
                System.out.println("Congratulations! You guessed the correct number in " + numGuesses + " guesses.");
                break;
            } else if (guess < num) {
                System.out.println("Too low! Guess higher.");
            } else {
                System.out.println("Too high! Guess lower.");
            }
        }

        if (numGuesses == maxguess) {
            System.out.println("Oops! You ran out of guesses.");
            System.out.println("The number I was thinking of was: " + num);
        }

        scan.close();
    }
}
		

