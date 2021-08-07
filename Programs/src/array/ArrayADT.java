package array;

public class ArrayADT {

	private int arr[];
	private int length;
	private int size;
	public ArrayADT(int size)
	{
		this.size = size;
		this.arr = new int[size];
		this.length = 0;
	}
	
	public void display()
	{
		for(int i=0;i<this.size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	
	public static void main(String args[])
	{
		ArrayADT arr = new ArrayADT(100);
		arr.display();
	}
}
