package array;

public class RotationShiftReverse {

	public static void main(String args[])
	{
		RotationShiftReverse obj = new RotationShiftReverse();
		obj.displayArray();
		obj.reverse();
		obj.displayArray();
		obj.leftShift();
		obj.displayArray();
	}
	
	private int arr[] = new int[] {0,1,2,3,4,5,6,7,8,9,10};
	
	public void displayArray()
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
		System.out.println("");
	}
	public void leftShift()
	{
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i] = arr[i+1];
		}
	}
	
	public void rightShift()
	{
		
	}
	public void leftRotate() {
		
	}
	public void rightRotate()
	{
		
	}
	public void reverse()
	{
		int i=0, j= arr.length-1;
		while(i<j)
		{
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
	}

}
