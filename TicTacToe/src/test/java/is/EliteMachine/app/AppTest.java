package is.EliteMachine.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void isWinTest(){
        App app = new App();

        assertEquals(true, app.isWin(new int[]{0, 1, 2}));
        assertEquals(true, app.isWin(new int[]{3, 4, 5}));
        assertEquals(true, app.isWin(new int[]{6, 7, 8}));
        assertEquals(true, app.isWin(new int[]{0, 3, 6}));
        assertEquals(true, app.isWin(new int[]{1, 4, 7}));
        assertEquals(true, app.isWin(new int[]{2, 5, 8}));
        assertEquals(true, app.isWin(new int[]{0, 4, 8}));
        assertEquals(true, app.isWin(new int[]{2, 4, 6}));
        assertEquals(false, app.isWin(new int[]{1, 5, 3}));
        assertEquals(false, app.isWin(new int[]{7, 2, 3}));
        assertEquals(false, app.isWin(new int[]{7, 2, 6}));
        assertEquals(false, app.isWin(new int[]{8, 1, 3}));
        assertEquals(false, app.isWin(new int[]{7, 2, 5}));
    }
    /*@Test
    public void isDrawTest(){
	App app = new App();

	assertEquals(true, app.isDraw());
    }*/
}
