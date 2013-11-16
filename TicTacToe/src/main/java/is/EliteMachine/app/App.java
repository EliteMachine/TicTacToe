package is.EliteMachine.app;

/**
 * Hello world!
 *
 */
public class App 
{
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

    // Initalize a game of TicTacToe
    public App()
    {
    }

    public static boolean isWin(int arr[])
    {
        int counter = 0;
        // Loop through winComb, check if arr matches any of the arrays in there.
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(winComb[i][j] == arr[j])
                    counter++;
            }
            if(counter == 3)
                return true;
        }
        return false;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
