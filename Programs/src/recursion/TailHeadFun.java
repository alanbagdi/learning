package recursion;

public class TailHeadFun {

	private void fun(int x)
	{
		if(x>0)
		{
			System.out.println(x);
			x--;
			fun(x);
		}
	}
	public static void main(String args[])
	{
		int x=3;
		TailHeadFun th = new TailHeadFun();
		th.fun(x);
	}
}
