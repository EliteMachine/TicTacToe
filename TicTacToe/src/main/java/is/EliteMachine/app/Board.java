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
	private static char [][] board_array;

	public Board(){
		board_array = new char[][]{
		{' ', ' ', ' '},
		{' ', ' ', ' '},
		{' ', ' ', ' '}
	   };
	}
	// Get the board.
	public char[][] getArray(){
		return board_array;
	}

	public void player_mark(char player_symbol, int x, int y){
		board_array[x][y] = player_symbol;
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