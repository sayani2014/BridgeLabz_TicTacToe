/**
 * Ask for another game once the game completes
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

        String player = whoPlaysFirst();

        //Create a player1 boolean that is true if it is player 1's turn and false if it is player 2's turn
        boolean player1 = true;

        //Create a gameEnded boolean and use it as the condition in the while loop
        boolean gameEnded = false;
        while(!gameEnded) {
            //Draw the board
            showboard(board);

            char inputChoice = chooseLetter();
            System.out.println("\n" + "Player has chosen " +inputChoice);

            playerPosition(inputChoice, board);

            //Check to see if either player has won
            if(playerHasWon(board) == 'X') {
                System.out.println(player + " wins!");
                gameEnded = true;
            }
            else if(playerHasWon(board) == 'O') {
                System.out.println(player + " wins!");
                gameEnded = true;
            }
            else {
                //If neither player has won, check to see if there has been a tie (if the board is full)
                if (boardIsFull(board)) {
                    System.out.println("It's a tie!");
                    gameEnded = true;
                } else {
                    //If player1 is true, make it false, and vice versa; this way, the players alternate each turn
                    player1 = !player1;
                }
            }
            while(gameEnded == true) {
                System.out.println("Play another game? Y | N");
                char option = input.next().charAt(0);

                if(option == 'Y') {
                    //Initilise the board with '-' to again start playing
                    gameEnded = false;
                    for (int i = 0; i < board.length; i++) {
                            board[i] = '-';
                        }
                }
                else
                    break;
            }
        }

        //Final game board
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

    public static char playerHasWon(char[] board) {
        StringBuilder s = new StringBuilder();
        String line = " ";
        for (int i = 0; i < 8; i++) {

            //Check for rows
            if(board[0] == board[1] && board[1] == board[2] && board[0] != '-' && board[1] != '-' && board[2] != '-')
                return board[i];
            if(board[3] == board[4] && board[4] == board[5] && board[3] != '-' && board[4] != '-' && board[5] != '-')
                return board[i];
            if(board[6] == board[7] && board[7] == board[8] && board[6] != '-' && board[7] != '-' && board[8] != '-')
                return board[i];

            //Check for columns
            if(board[0] == board[3] && board[3] == board[6] && board[0] != '-' && board[3] != '-' && board[6] != '-')
                return board[i];
            if(board[1] == board[4] && board[4] == board[7] && board[1] != '-' && board[4] != '-' && board[7] != '-')
                return board[i];
            if(board[2] == board[5] && board[5] == board[8] && board[2] != '-' && board[5] != '-' && board[8] != '-')
                return board[i];

            //Check for diagonals
            if(board[0] == board[4] && board[4] == board[8] && board[0] != '-' && board[4] != '-' && board[8] != '-')
                return board[i];
            if(board[2] == board[4] && board[4] == board[6] && board[2] != '-' && board[4] != '-' && board[6] != '-')
                return board[i];
        }
        return '-';
    }

    //Check if all of the positions on the board have been filled
    public static boolean boardIsFull(char[] board) {
        for(int i = 0; i < board.length; i++) {
                if(board[i] == '-') {
                    return false;
                }
            }
        return true;
    }
}
