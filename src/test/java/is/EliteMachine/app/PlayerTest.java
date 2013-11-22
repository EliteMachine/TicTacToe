package is.EliteMachine.app;
//This is a test class for the Player class in main

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest
{
	Player p = new Player();
	@Test
	public void isPlayerOneX(){
		p.XOPlayers(2);
		assertEquals('X', p.getPlayerSymbol());
	}

	@Test
	public void isPlayerTwoO(){
		p.XOPlayers(1);
		assertEquals('O', p.getPlayerSymbol());
	}

	@Test
	public void incrementTurn_test(){
		p.incrementTurn();
		assertEquals("Should return 1", 1, p.getPlayerTurn());
	}
}
