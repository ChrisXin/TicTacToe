import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Game {
	static public void gaming(int[][] board) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean t = true;
		boolean wp = false;
		boolean w = false;
		
	while(!w) {
		boolean ic = false;
		int r = -1;
		int c = -1;
		
		while(!ic){
			if(t)
				System.out.print("Player 1 ");
			else
				System.out.print("Player 2 ");
			System.out.print("enter position (row = A,B,C) (col = 1,2,3), eg A1: ");

			String s = br.readLine();
			
	        if( (s.charAt(0) == 'A' || s.charAt(0) == 'B' || s.charAt(0) == 'C') &&
	        		(s.charAt(1) == '1' || s.charAt(1) == '2' || s.charAt(1) == '3') ) {
	        	switch(s.charAt(0))
	        	{
	        	case 'A':
	        		r = 0;
	        		break;
	        	case 'B':
	        		r = 1;
	        		break;
	        	case 'C':
	        		r = 2;
	        		break;
        		default:
        			r = -1;
        			break;
	        	}
	        	
	        	c = Character.getNumericValue(s.charAt(1)) - 1;
	        	
	        	if(board[r][c] != 0){
	        		System.out.println("That spot has been taken");
	        	} else {
	        		ic = true;
	        	}
	        }
		}
		
		if(t)
			board[r][c] = 1;
		else
			board[r][c] = 2;
		
		System.out.println("-------");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("|");
				if(board[i][j] == 1)
					System.out.print("X");
				else if(board[i][j] == 2)
					System.out.print("O");
				else
					System.out.print(" ");
			}
			System.out.println("|");
			System.out.println("-------");
		}
		
		if( 	(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] != 0) ||
				(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] != 0) ||
				(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] != 0) ||
				
				(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] != 0) ||
				(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] != 0) ||
				(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] != 0) ||
				
				(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != 0) ||
				(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != 0)
				) {
			w = true;
			
			wp = t;
			
			if(wp)
				System.out.println("Player 1 won");
			else
				System.out.println("Player 2 won");
		}
		else {
			boolean f = true;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(board[i][j] == 0) {
						f = false;
						break;
					}
				}
			}
			
			if(f)
			{
				w = true;
				System.out.println("Game is at a draw");
			}
			else
			{
				t = !t;
			}
		}
	}
	}
}
