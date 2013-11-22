package is.EliteMachine.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BoardTest{

    Board a = new Board();
	Board b = new Board();
	Board c = new Board();

	@Test
	public void playerMarkTest(){
		b.playerMark('X', 1, 1);
		c.playerMark('X', 1, 0);
		assertThat(b, is(not(c)));
	}

    @Test
    public void checkFieldTest() {
        a.playerMark('X', 1, 1);
        assertEquals(true, isSet(1, 1));
        assertEquals(false, isSet(0, 0));
        assertEquals(false, isSet(2, 2));
        a.playerMark('X', 0, 2);
        assertEquals(true, isSet(0, 2));
    }
}
