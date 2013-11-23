package is.EliteMachine.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BoardTest{

    Board a = new Board();
	Board b = new Board();
    private static char[][] boardArr = new char[][] {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

	@Test
	public void playerMarkTest() {
		a.playerMark('X', 1, 1);
		b.playerMark('X', 1, 0);
		assertThat(a, is(not(b)));
	}

    @Test
    public void checkFieldTest() {
        a = new Board();
        a.playerMark('X', 1, 1);
        assertEquals(true, a.isSet(1, 1));
        assertEquals(false, a.isSet(0, 0));
        assertEquals(false, a.isSet(2, 2));
        a.playerMark('X', 0, 2);
        assertEquals(true, a.isSet(0, 2));
    }
    
    @Test
    public void getBoardTest() {
        a = new Board();
        assertEquals(boardArr, a.getBoard());
        boardArr[1][2] = 'X';
        assertThat(boardArr, not(equalTo(a.getBoard())));
    }

    @Test
    public void boardPrintTest() {
        a = new Board();
        a.printBoard();
        System.out.println();
        a.playerMark('X', 1, 1);
        a.printBoard();
    }
}
