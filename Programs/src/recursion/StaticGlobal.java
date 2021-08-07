package recursion;

public class StaticGlobal {
	int x =0 ;
	private int fun(int n)
	{
		 
		if(n>0)
		{
			x++;
			return fun(n-1)+x;
			
		}
		return 0;
	}
	
	public static void main(String args[])
	{
		StaticGlobal sg = new StaticGlobal();
		int funVal = sg.fun(5);
		System.out.println(funVal);
	}
}
