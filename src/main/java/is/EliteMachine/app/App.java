package is.EliteMachine.app;

import java.util.Scanner;

public class App 
{
    private static Board b;
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
        //this.p = new Player();

        this.gameTurn = 1;
    }

    public static void playGame()
    {
        int[] xy = new int[2];

        System.out.print("Please input what row and column you want to place your mark (between 1 and 3): ");
        
        do {
            xy = getInput();
            if(!b.isSet(xy[0] - 1, xy[1] - 1)) {
                if(gameTurn % 2 == 1){
                    b.playerMark('X', xy[0] - 1, xy[1] - 1);
                    return;
                }
                else if(gameTurn % 2 == 0) {
                    b.playerMark('O', xy[0] - 1, xy[1] - 1);
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
        return false;
    }

    public static void main(String[] args)
    {
        App a = new App();

        while(true)
        {
            playGame();
            b.printBoard();
            gameTurn++;
            System.out.println();
        }
    }
}
