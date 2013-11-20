package is.EliteMachine.app
//This is a test class for the Player class in main

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest
{
	Player player = new Player();
	@Test
	public void isPlayerOneX(){
		player.XOPlayers(2, playerSymbol);
		assertThat(player, is('X'));
	}
	
	@Test
	public void isPlayerTwoO(){
		player.XOPlayers(1, playerSymbol);
		assertThat(player, is('O'));
	}
}
