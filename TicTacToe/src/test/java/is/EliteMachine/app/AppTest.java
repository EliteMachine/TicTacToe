package is.EliteMachine.app;

import static org.junit.Assert.assertEquals;

import junit.framework.Test;

public class AppTest 
{
    @Test
    public boolean isWin(){
        App app = new App();
        assertEquals(true, app.checkWin([1, 2, 3]));
        assertEquals(true, app.checkWin([4, 5, 6]));
        assertEquals(true, app.checkWin([7, 8, 9]));
        assertEquals(true, app.checkWin([1, 4, 7]));
        assertEquals(true, app.checkWin([2, 5, 8]));
        assertEquals(true, app.checkWin([3, 6, 9]));
        assertEquals(true, app.checkWin([1, 5, 9]));
        assertEquals(true, app.checkWin([7, 5, 3]));
        assertEquals(false, app.checkWin([1, 5, 3]));
        assertEquals(false, app.checkWin([7, 2, 3]));
        assertEquals(false, app.checkWin([7, 2, 6]));
        assertEquals(false, app.checkWin([8, 1, 3]));
        assertEquals(false, app.checkWin([7, 2, 5]));
    }
}
