package is.EliteMachine.app;
//This is a player class
public class Player {
      private static char playerSymbol;

      public Player(char playerSymbol){
              this.playerSymbol = playerSymbol;
      }

      public char getPlayerSymbol(){
          return this.playerSymbol;
      }
}

