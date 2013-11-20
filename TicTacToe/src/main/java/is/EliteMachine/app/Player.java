package is.EliteMachine.app;
//This is a player class
public class Player {
	private int playerTurn;
	private char playerSymbol;

	public Player(){
		this.playerTurn = 0;
		this.playerSymbol = ' ';
	}

	public static void XOPlayers(int playerTurn, char playerSymbol){
		if(playerTurn % 2 == 0){
			playerSymbol = 'X';
		}
		else{
			playerSymbol = 'O';
		}
	}
}
