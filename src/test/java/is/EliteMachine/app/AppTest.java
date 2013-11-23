package is.EliteMachine.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void isWinTest(){
        App a = new App();

        assertEquals(false, a.isWin());
        a.b.playerMark('X', 0, 0);
        a.b.playerMark('X', 0, 1);
        a.b.playerMark('X', 0, 2);
        assertEquals(true, a.isWin());

        a.b = new Board();
        assertEquals(false, a.isWin());
        a.b.playerMark('X', 1, 0);
        a.b.playerMark('X', 1, 1);
        a.b.playerMark('X', 1, 2);
        assertEquals(true, a.isWin());

        a.b = new Board();
        assertEquals(false, a.isWin());
        a.b.playerMark('X', 0, 0);
        a.b.playerMark('X', 1, 0);
        a.b.playerMark('X', 2, 0);
        assertEquals(true, a.isWin());

        a.b = new Board();
        a.b.playerMark('X', 0, 0);
        a.b.playerMark('X', 1, 1);
        a.b.playerMark('X', 2, 2);
        assertEquals(true, a.isWin());
    }
}
