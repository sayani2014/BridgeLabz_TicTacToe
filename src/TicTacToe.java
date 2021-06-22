/**
 * Toss to check who plays first.
 * Use Random to determine who starts first, the computer or the user
 *
 * @author : SAYANI KOLEY
 * @since : 22.06.2021
 */

import java.util.Scanner;

public class TicTacToe {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char[] board = new char[10];

        System.out.println("Game initiated!");

        //Display the initial board
        for(int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        showboard(board);

        whoPlaysFirst();

        char inputChoice = chooseLetter();
        System.out.println("Player has chosen " +inputChoice);

        playerPosition(inputChoice, board);
        showboard(board);
    }

    //Display the board
    public static void showboard(char[] board) {
        System.out.println("\n" + "Displaying the Tic Tac Toe Board");
        System.out.println(board[0] + "  " + board[1] + "  " + board[2]);
        System.out.println(board[3] + "  " + board[4] + "  " + board[5]);
        System.out.println(board[6] + "  " + board[7] + "  " + board[8]);
    }

    //Initiate the game by asking the player to choose the input
    public static char chooseLetter() {
        System.out.println("\n" + "Enter your choice: X | O");
        char choice = input.next().charAt(0);

        return choice;
    }

    //Ask the user for what position they want to place their x or o
    public static void playerPosition(char inputCharUser, char[] board) {
        System.out.print("Enter the position you want to enter the value:  ");
        int position = input.nextInt();

        //Check if the postion does not exceed
        if(position < 0 || position > 8)
            System.out.println("This position is out of the bounds of the board! Try again!");
            //Check if the position on the board the user entered is empty or not
        else if(board[position] != '-')
            System.out.println("Someone has already made a move at this position! Try again!" + "\n");
        else
            board[position] = inputCharUser;
    }

    //Toss to check who plays first
    public static String whoPlaysFirst() {
        int randomNumber = (int) Math.floor(Math.random() * 10) % 2;
        String player = "";

        if(randomNumber == 1)
            player = "User";
        else
            player = "Computer";

        System.out.println("\n" + player + " starts first.");

        return player;
    }
}
