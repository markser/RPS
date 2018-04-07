import java.util.Random;
import java.util.Scanner;

/**
 * A program modeled after the popular game: Rock, Paper, Scissors.
 * The provided code is incomplete. Modify it so that it works properly
 * When you are done, consider making additional changes
 * <p>
 * 1. Create Rock, Paper, Scissors, Lizard, Spock.
 * https://www.youtube.com/watch?v=cSLeBKT7-sM
 * <p>
 * 2. Have the program battle 2 computers. Hint, you will need to do something with String user = userChoice();
 * <p>
 * 3. Create a scoreboard so you know who is winning. Hint, you will need to use variables.
 * <p>
 * 4. Let your mind wander and explore what Java has to offer.
 */
public class RockPaperScissors {

    /**
     * Scanner allows you to take inputs from the console.
     * Read more here https://www.javatpoint.com/Scanner-class
     */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        play();
        while (playAgain()) {
            play();
        }
    }

    /**
     * Groups up the required functions to clean up the main function.
     */

    public static void play() {

        String computer = computerChoice();
        String user = userChoice();
        determineWinner(computer, user);
    }

    /**
     * Function that determines the computer's choice by the use of the Random function.
     * The computer choice should return a string.
     *
     * @return the computer's choice
     */


    public static String computerChoice() {

        Random rand = new Random();
        int computerChoice = rand.nextInt(3) + 1;
        String computer = "";
        if (computerChoice == 1)
            computer = "Rock";
        if (computerChoice == 2)
            computer = "Paper";
        if (computerChoice == 3)
            computer = "Scissors";
        return computer;
    }

    /**
     * Function that determines if the user wants to play again
     * Built in error checking
     *
     * @return true, if user wants to play again
     * false, if the user doesn't want to play again
     */

    public static boolean playAgain() {

        System.out.println("Play again? (y/n)");
        String input = sc.nextLine();
        if (input.toLowerCase().equals("y")) {
            return true;
        } else if (input.toLowerCase().equals("n")) {
            return false;
        } else {
            //Uses the idea of Recursion.
            //Learn more here https://introcs.cs.princeton.edu/java/23recursion/
            System.out.println("Invalid Input");
            return playAgain();
        }
    }

    /**
     * Function that retrieves the user's choice of Rock, Paper, or Scissors.
     * Uses Java Scanner Function to retrieve input through console.
     * https://www.javatpoint.com/Scanner-class
     *
     * @return User's choice
     */

    public static String userChoice() {

        String userInput;
        do {
            System.out.println("Choose your weapon: Rock, Paper, or Scissors");
            userInput = sc.nextLine();
        } while (!isValidChoice(userInput));
        return userInput;
    }

    /**
     * Function that checks if the input is a valid choice. Will prompt if input is rejected.
     *
     * @param choice input
     * @return true, if user wants to play again
     * false, if the user doesn't want to play again
     */

    public static boolean isValidChoice(String choice) {

        boolean status;
        if (choice.equals("Rock"))
            status = true;
        else if (choice.equals("Paper"))
            status = true;
        else if (choice.equals("Scissors"))
            status = true;
        else {
            status = false;
            System.out.println("Error! Make sure you are capitalizing your choices");
        }
        return status;
    }

    /**
     * Function that determines the winner of the match
     * You must use if statements to successfully program this function
     * https://www.javatpoint.com/java-if-else
     *
     * @param computer computer's input
     * @param user     user's input
     */
    public static void determineWinner(String computer, String user) {

        System.out.println("Computer Choice: " + computer);
        System.out.println("Your Choice: " + user);

        // Write your code here
        // EX:
        // if (computer.equals("Rock") && user.equals("Scissors"))
        // {
        // System.out.println("Computer wins! Better luck next time!");
        //}


    }
}