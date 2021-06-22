/**
 * Start fresh by creating a tic tac toe board
 * Create a TicTacToeGame class
 * Create method for every use case and call from main
 * Create a board of char[] of size 10 and assign empty space to each element
 * 0th index is ignored to make it user friendly
 *
 * @author : SAYANI KOLEY
 * @since : 22.06.2021
 */

public class TicTacToe {
    public static void main(String[] args) {
        char[] board = new char[10];
        for(int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        System.out.println(board);
    }
}
