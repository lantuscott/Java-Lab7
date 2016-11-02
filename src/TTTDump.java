
public class TTTDump
{

	public static int[][] initBoard()
	{
		int[][] board = new int[3][3];
		
		for (int row=0; row<3; row++)
			for (int col=0; col<3; col++)
				board[row][col] = (Math.random() < 0.5) ? 'X' : 'O';
		
		return board;
	}
	
//	public static void main(String[] args)
//	{
//	 finish this: create new board through call to initBoard(),
//		then print out all 8 lines (3 rows, 3 columns, 2 diagonals)
// }

	
}


