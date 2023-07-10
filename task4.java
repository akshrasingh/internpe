package tryprograms;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.print("Enter your move (rock, paper, or scissors): ");
            String playerMove = scanner.nextLine().toLowerCase();

            if (!isValidMove(playerMove)) {
                System.out.println("Invalid move. Please enter rock, paper, or scissors.");
                continue;
            }

            String computerMove = generateComputerMove();
            System.out.println("Computer chooses: " + computerMove);

            String result = determineWinner(playerMove, computerMove);
            System.out.println(result);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for playing Rock, Paper, Scissors!");
        scanner.close();
    }

    private static boolean isValidMove(String move) {
        return move.equals("rock") || move.equals("paper") || move.equals("scissors");
    }

    private static String generateComputerMove() {
        int randomNum = (int) (Math.random() * 3); // Generates a random number between 0 and 2

        switch (randomNum) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }

    private static String determineWinner(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "It's a tie!";
        } else if (
                (playerMove.equals("rock") && computerMove.equals("scissors")) ||
                (playerMove.equals("paper") && computerMove.equals("rock")) ||
                (playerMove.equals("scissors") && computerMove.equals("paper"))
        ) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
