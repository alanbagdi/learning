package backtracking;

public class RatInMaze {
	private static int N  = 4;
	private static int[] xmove = new int[] {0,1,-1,0};
	private static int[] ymove = new int[] {1,0,0,-1};
	private int[][] sol = new int[N][N];
	
	public static void main(String args[])
    {
		RatInMaze rat = new RatInMaze();
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
        rat.initializeSol();
        rat.solveMaze(maze);
        rat.printMaze();
    }
	
	
	
	private void solveMaze(int[][] maze) {
		solveMazeUtils(maze, 0, 0);
		
	}
	
	private boolean solveMazeUtils(int[][] maze,int x,int y)
	{
		if(x==N-1 && y == N-1)
		{
			return true;
		}
		
		for(int i=0;i<N;i++)
		{
			int nextX = x+ xmove[i];
			int nextY = y+ ymove[i];
			if(isSafe(maze,nextX,nextY))
			{
				sol[nextX][nextY] =1;
				if(solveMazeUtils(maze, nextX, nextY))
					return true;
				sol[nextX][nextY] = 0;
			}
		}
		return false;
	}
	
	private void initializeSol()
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				sol[i][j] = 0;
			}
		}
		sol[0][0] = 1;
	}
	
	private void printMaze() {
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(sol[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private boolean isSafe(int[][] maze, int x,int y)
	{
		if(x>=0 && x<N && y >= 0  && y<N && sol[x][y]==0 && maze[x][y] ==1)
			return true;
		return false;
	}
}
