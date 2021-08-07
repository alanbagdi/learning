package recursion;

public class TowerOfHanoi {
	private void TOH(int n, int t1,int t2,int t3)
	{
		if(n>0)
		{
			TOH(n-1,t1,t3,t2);
			System.out.println(t1+" "+t3);
			TOH(n-1,t2,t1,t3);
		}
	}
	public static void main(String args[])
	{
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.TOH(4,1,2,3);
	}
}
