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

	public Board(){
		boardArray = new char[][]{
		{' ', ' ', ' '},
		{' ', ' ', ' '},
		{' ', ' ', ' '}
	   };
	}
	// Get the board.
	public char[][] getArray(){
		return boardArray;
	}

	public void playerMark(char playerSymbol, int x, int y){
        if(!isSet(x, y))
    		boardArray[x][y] = playerSymbol;
	}
    
    public boolean isSet(int x, int y) {
        return boardArray[x][y] != ' ';
    }

	// Print the board.
	public void print_board(char[][] board_array){
		for (int i = 0; i < board_array.length; i++) {
			for (int j = 0; j < board_array.length; j++) {
				System.out.print("[" + board_array[i][j] + "]");
			}
			System.out.println();
		}
	}
}
