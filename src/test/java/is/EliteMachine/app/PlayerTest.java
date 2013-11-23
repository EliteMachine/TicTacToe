package is.EliteMachine.app;
//This is a test class for the Player class in main

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class PlayerTest
{
	@Test
	public void isPlayerOneX() {
        Player p1 = new Player('X');
		assertEquals('X', p1.getPlayerSymbol());
        assertThat('O', is(not(p1.getPlayerSymbol())));
	}

	@Test
	public void isPlayerTwoO() {
        Player p2 = new Player('O');
		assertEquals('O', p2.getPlayerSymbol());
        assertThat('X', is(not(p2.getPlayerSymbol())));
	}
}
