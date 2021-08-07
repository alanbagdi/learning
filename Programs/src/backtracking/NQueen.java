package backtracking;

public class NQueen {
	private static int N  = 4;
	private static int[] xmove = new int[] {0,1,-1,0};
	private static int[] ymove = new int[] {1,0,0,-1};
	private int[][] sol = new int[N][N];
	
	public static void main(String args[])
    {
		NQueen rat = new NQueen();
        int board[][] = new int[N][N];
        rat.solveMazeUtils(board,0);
        rat.printMaze(board);
    }
	
	private boolean solveMazeUtils(int[][] maze,int col)
	{
		if(col >= N)
			return true;
		
		for(int i=0;i<N;i++)
		{
			if(isSafe(maze, i, col))
			{
				maze[i][col] = 1;
				
				if(solveMazeUtils(maze, col+1))
					return true;
				maze[i][col] =0;
			}
		}
		return false;
	}
	
	private void printMaze(int[][] maze) {
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private boolean isSafe(int[][] maze, int row,int col)
	{
		int i,j;
		for(i=0;i<col;i++)
		{
			if(maze[row][i] == 1)
				return false;
		}
		for(i= row,j=col;i>=0 && j>=0;j--,i--)
		{
			if(maze[i][j] == 1)
				return false;
		}
		for(i=row,j=col;i<N && j>=0;i++,j--)
		{
			if(maze[i][j] == 1)
				return false;
		}
		return true;
	}
	
}
