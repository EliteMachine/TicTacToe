package is.EliteMachine.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
public class BoardTest{

	Board b = new Board();
	Board c = new Board();
	@Test
	public void player_mark_test(){
		b.player_mark('X', 1, 1);
		c.player_mark('X', 1, 0);
		assertThat(b, is(not(c)));
	}
}
