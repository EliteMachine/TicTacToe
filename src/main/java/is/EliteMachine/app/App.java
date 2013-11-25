package is.EliteMachine.app;

import java.util.Scanner;

public class App 
{
    public static Board b;
    private static int gameTurn;

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
        // Initialize empty grid.
        this.b = new Board();

        this.gameTurn = 1;
    }

    public static void playGame()
    {
        int[] xy = new int[2];

        System.out.print("Please input what row and column you want to place your mark (between 1 and 3, fx. 2 3 for row 2 and column 3): ");
        
        do {
            xy = getInput();
            if(!b.isSet(xy[0] - 1, xy[1] - 1)) {
                if(gameTurn % 2 == 1){
                    b.playerMark('Z', xy[0] - 1, xy[1] - 1);
                    return;
                }
                else {
                    b.playerMark('W', xy[0] - 1, xy[1] - 1);
                    return;
                }
            }
            else
                System.out.println("Field already marked, pick another one.");
        }while(true);
    }

    public static int[] getInput() {
        int[] inp = new int[2];

        Scanner sc = new Scanner(System.in);

        do {
            inp[0] = sc.nextInt();
            inp[1] = sc.nextInt();
        } while((inp[0] < 1 || inp[0] > 3) && (inp[1] < 1 || inp[1] > 3));

        return inp;
    }

    public static boolean isWin()
    {
        int counter = 0;
        char[][] tmpBoard = new char[3][3];
        char[] board = new char[9];
        tmpBoard = b.getBoard();

        // Flatten out the 2d array so it will be easier to compare it to winComb.
        for(int i = 0; i < tmpBoard.length; i++) {
            for(int j = 0; j < tmpBoard.length; j++) {
                board[counter] = tmpBoard[i][j];
                counter++;
            }
        }
        
        // Check if there are any winning combinations on the board, return true if so.
        for(int i = 0; i < winComb.length; i++) {
            if((board[winComb[i][0]] != ' ') && (board[winComb[i][0]] == board[winComb[i][1]]) && (board[winComb[i][0]] == board[winComb[i][2]]))
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        App a = new App();
        
        // Print out initial game board.
        b.printBoard();
        System.out.println();

        while(true)
        {
            if(gameTurn >= 10) {
                System.out.println("The match ended in a draw.");
                break;
            }

            playGame();
            b.printBoard();
            if(isWin()) {
                if(gameTurn % 2 == 1) {
                    System.out.println("Z wins!");
                    break;
                }
                else {
                    System.out.println("W wins!");
                    break;
                }
            }
            gameTurn++;
            System.out.println();
        }
    }
}
