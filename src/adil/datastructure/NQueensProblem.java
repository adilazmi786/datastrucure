package adil.datastructure;

public class NQueensProblem {
	static final int N=17; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueensProblem nQueen=new NQueensProblem();
		int board[][]=new int[N][N];
		nQueen.inputData(board);
		if(solveQueenProblem(board,0))
		nQueen.printResult(board);
		else {
			System.out.println("Not Exist");
		}

	}
	
	private static boolean solveQueenProblem(int[][] board, int row) {
		// TODO Auto-generated method stub
		if(row>=N)
			return true;
		for(int i=0;i<N;i++) {
			if(isSafe(board,row,i)) {
				board[row][i]=1;
				if(solveQueenProblem(board, row+1))
				return true;
				else {
					board[row][i]=0;
				}
			}
		}
		return false;
	}

	private static boolean isSafe(int[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// same column
		for(int i=0;i<=row;i++) {
			if(board[i][col]==1) {
				return false;
			}
		}
		// case for upper left diagonal
		for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(board[i][j]==1)
				return false;
			
		}
		// case for upper right diagonal
		for(int i=row,j=col;i>=0 && j<N;i--,j++) {
			if(board[i][j]==1)
				return false;
		}
		return true;
	}

	private void inputData(int[][] board) {
		// TODO Auto-generated method stub
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				board[i][j]=0;
			}
		}
		
	}
	private void printResult(int[][] board) {

		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
