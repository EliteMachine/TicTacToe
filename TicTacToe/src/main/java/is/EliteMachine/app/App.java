package is.EliteMachine.app;
public class App 
{
    private char playerSymbol;
    private int turnNumber;
    private static Board b;
    private static int[][] winComb = new int[][] {
        {0, 1, 2},
        {3, 4, 5},
        {6, 7, 8},
        {0, 3, 6},
        {1, 4, 7},
        {2, 5, 8},
        {0, 4, 8},
        {2, 4, 6}
    };

    private static char[][] board_array = new char[][]{
	{' ', ' ', ' '},
	{' ', ' ', ' '},
	{' ', ' ', ' '}
    };

    // Initalize a game of TicTacToe
    public App()
    {
        // Initialize empty grid.
    	this.b = new Board();
        this.playerSymbol = 'X';
        this.turnNumber = 1;
    }

    public static void playGame()
    {
        // Game logic.
    }

    public static boolean isWin(int arr[])
    {
        int counter = 0;
        // Loop through winComb, check if arr matches any of the arrays in there.
        // If all array indices match, counter will be increased to 3, and the function returns true.
        // Otherwise, reset counter after each array check.
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(winComb[i][j] == arr[j])
                    counter++;
            }
            if(counter == 3)
                return true;
            else
                counter = 0;
        }
        return false;
    }

    public static void main(String[] args)
    {
        App a = new App();
    	b.print_board(b.getArray());
	    //b.player_mark('X', 1, 1);
        while(true)
        {
            System.out.print(a.playerSymbol + " > ");
            // Play the game!
            playGame();
            // Check for winning combinations.
            // Get all rows from the board and check for winning combinations.
            a.playerSymbol = 'O';
            
            a.turnNumber++;
            if(a.turnNumber > 9)
            {
                System.out.println("The match resulted in a draw. Good game!");
                break;
            }

            System.out.print(a.playerSymbol + " > ");
            playGame();
            // Check for winning combinations.
            // Get all rows from the board and check for winning combinations.
            a.playerSymbol = 'X';

            a.turnNumber++;
            if(a.turnNumber > 9)
            {
                System.out.println("The match resulted in a draw. Good game!");
                break;
            }
            System.out.print(a.turnNumber + "!\n");
        }
    }
}