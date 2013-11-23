package is.EliteMachine.app;
//This is a test class for the Player class in main

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest
{
	Player p1 = new Player('X');
    player p2 = new Player('O');

	@Test
	public void isPlayerOneX() {
		assertEquals('X', p1.getPlayerSymbol());
        assertThat('O', is(not(p1.getPlayerSymbol())));
	}

	@Test
	public void isPlayerTwoO() {
		assertEquals('O', p2.getPlayerSymbol());
        assertThat('X', is(not(p2.getPlayerSymbol())));
	}
    /*
	@Test
	public void incrementTurn_test(){
		p.incrementTurn();
		assertEquals("Should return 1", 1, p.getPlayerTurn());
	}*/
}
