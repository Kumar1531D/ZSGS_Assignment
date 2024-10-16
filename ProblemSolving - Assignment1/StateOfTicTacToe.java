package problemSolvingAssignment;

import java.util.Scanner;

public class StateOfTicTacToe {
	
	public static final char X = 'x';
    public static final char O = 'o';
	
	public static String checkState(char board[][]) {
		
		int countX = 0;
		int countO = 0;
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == X) {
                	countX++;
                } else if (board[i][j] == O) {
                	countO++;
                }
            }
        }
		
		if (countO > countX || countX > countO + 1) {
            return "Invalid turn order";
        }
		
		int win =0;
		
		for (int i = 0; i < 3; i++) {
            if (board[i][0] != '.' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
            	win++;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i] != '.' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
            	win++;
            }
        }

        if (board[0][0] != '.' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
        	win++;
        }

        if (board[0][2] != '.' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
        	win++;
        }
        
        if(win>1)
        	return "Continued playing after win";
        
        if(win==1)
        	return "Win";
        
        boolean isDraw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '.') {
                    isDraw = false;
                    break;
                }
                
            }
        }
        
        if (isDraw) {
            return "Draw";
        }

        return "Game is still ongoing";
    }
		

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		char matrix[][] = new char[3][3];
		
		System.out.println("Enter the board values (put '.' for empty places) : ");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j] = in.next().charAt(0);
			}
		}
		
		String ans = checkState(matrix);
		
		System.out.println(ans);

	}

}
