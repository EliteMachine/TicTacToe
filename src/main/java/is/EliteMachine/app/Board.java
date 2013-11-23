package is.EliteMachine.app;
/**
*
* <h1> A simple grid for Tic Tac Toe.</h1>
*
* Output example:
* [ ][ ][X]
* [ ][O][X]
* [ ][ ][O]
*/

public class Board {
	private static char [][] boardArray;

	public Board() {
		boardArray = new char[][] {
		{' ', ' ', ' '},
		{' ', ' ', ' '},
		{' ', ' ', ' '}
	   };
	}
	// Get the board.
	public static char[][] getBoard() {
		return boardArray;
	}

	public static void playerMark(char playerSymbol, int x, int y) {
  		boardArray[x][y] = playerSymbol;
	}
    
    public static boolean isSet(int x, int y) {
        return boardArray[x][y] != ' ';
    }

	// Print the board.
	public static void printBoard() {
		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray.length; j++) {
				System.out.print("[" + boardArray[i][j] + "]");
			}
			System.out.println();
		}
	}
}
