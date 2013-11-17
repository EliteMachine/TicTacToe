package is.EliteMachine.app;
/**
*
* <h1> A simple grid for Tic Tac Toe.</h1>
*
* Output example:
* [][][]
* [][][]
* [][][]
*/

public class Board {
	private static char blank;
	private static char [][] board_array;

	public Board(){
		blank = ' ';
		board_array = new char[3][3];
		// Initialize the board.
		for (int i = 0; i < board_array.length; i++) {
			for (int j = 0; j < board_array.length; j++) {
				board_array[i][j] = blank;
			}
		}
	}
	// Print the board.
	public static void print_board(char[][] board_array){
		for (int i = 0; i < board_array.length; i++) {
			for (int j = 0; j < board_array.length; j++) {
				System.out.print("[" + board_array[i][j] + "]");
			}
			System.out.println();
		}
	}
}
