/**
 * As a Player would like to see the board so I can choose the valid cells to make my move during my turn
 * Write a method showBoard to display the current Board
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

        char inputChoice = chooseLetter();
        System.out.println("Player has chosen " +inputChoice);

    }

    public static void showboard(char[] board) {
        System.out.println("\n" + "Displaying the Tic Tac Toe Board");
        System.out.println(board[0] + "  " + board[1] + "  " + board[2]);
        System.out.println(board[3] + "  " + board[4] + "  " + board[5]);
        System.out.println(board[6] + "  " + board[7] + "  " + board[8]);
    }

    public static char chooseLetter() {
        System.out.println("\n" + "Enter your choice: X | O");
        char choice = input.next().charAt(0);

        return choice;
    }
}
