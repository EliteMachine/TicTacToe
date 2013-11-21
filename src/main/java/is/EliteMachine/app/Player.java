package is.EliteMachine.app;
//This is a player class
public class Player {
      private static int playerTurn;
      private static char playerSymbol;

      public Player(){
              playerTurn = 0;
              playerSymbol = ' ';
      }

      public void XOPlayers(int playerTurn, char playerSymbol){
              if(playerTurn % 2 == 0){
                      playerSymbol = 'X';
              }
              else{
                      playerSymbol = 'O';
              }
      }

      public int getPlayerTurn(){
              return playerTurn;
      }
      
      public void setPlayerSymbol(char player_Symbol){
    	  playerSymbol = player_Symbol;
      }

      public char getPlayerSymbol(){
              return playerSymbol;
      }

      public void incrementTurn(){
              playerTurn += 1;
      }
}

