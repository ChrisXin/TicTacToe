
public class Board{
	public static void printout(int[][] board, int row, int column){
		
	System.out.println("-------");
	for(int i = 0; i < row; i++) {
		for(int j = 0; j < column; j++) {
			board[i][j] = 0;
			System.out.print("| ");
		}
		System.out.println("|");
		System.out.println("-------");
	}
	}
}
