import java.io.IOException;

public class Main {
	static int row = 3;
	static int column = 3;
	static int board[][] = new int[row][column];
	
	public static void main(String[] args) throws IOException {
		// super cool stuff

		Board.printout(board, row ,column);
		
		Game.gaming(board);
		
	    
	}
}