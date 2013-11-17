package is.EliteMachine.app;

import junit.framework.Assert;
import java.util.ArrayList;

public class AppTest
{
   public void testGrid()
    {
	App a = new App();
	ArrayList<Character> p = new ArrayList<Character>();
	p = a.printGrid();
	Assert.assertEquals("         ", p);
    }
}
