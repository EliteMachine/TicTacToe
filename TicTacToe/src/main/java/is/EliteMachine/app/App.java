package is.EliteMachine.app;
import java.util.Arrays;
import java.util.ArrayList;
public class App 
{
	private char blank;
	private char[][] gridA;
	public App(){
		blank = ' ';
		gridA = new char[3][3];
		for(int i = 0; i < gridA.length; i++){
			for(int k = 0; k < gridA.length; k++){
	    			gridA[i][k] = blank;
			}
    		}
	} 

    	public static ArrayList<Character> printGrid(char[][] gridA){ 
		ArrayList<Character> myList = new ArrayList<Character>();
		for(int i = 0; i < gridA.length; i++){
	    		for(int k = 0; k < gridA.length; i++){
	    			myList.add(gridA[i][k]);
            		}
		}
		return(myList);
	}

    	public static void main( String[] args )
    	{
     		new App();
    	}
}
