package backtracking;

public class KnightTour {

	private static final int N= 8;
	private static int[][] sol = new int[8][8];
	static int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    static int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
	public static void main(String args[])
	{
		initializeSolution();
		sol[0][0] = 0;
		solve(0,0,1);
		printSolution();
	}
	
	private static void printSolution() {
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(sol[i][j]+ " ");
			}
			System.out.println();
		}
	}

	private static void initializeSolution() {
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				sol[i][j] = -1;
			}
		}
	}

	private static boolean solve(int row, int col,int moves) {
		
		if(moves == N*N)
			return true;
		
		int next_x , next_y;
		
		for(int i=0;i<N;i++)
		{
			next_x = row + xMove[i];
			next_y = col + yMove[i];
			
			if(isSafe(next_x,next_y))
			{
				sol[next_x][next_y]=moves;
				
				if(solve(next_x,next_y,moves+1))
					return true;
				
				sol[next_x][next_y]=-1;
			}
		}
		return false;
	}

	private static boolean isSafe(int x, int y) {
		if(x>=0 && x<N && y>=0 && y<N && sol[x][y] ==-1 )
			return true;
		return false;
	}
}
