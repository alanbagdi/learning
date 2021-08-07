package array;

import java.util.Scanner;

public class LinearSearchInArray {
	private int arr[] = new int[] {0,1,2,3,4,5,6,7,8,9};
	public static void main(String args[])
	{
		
		LinearSearchInArray linearSearchInArray = new LinearSearchInArray();
		System.out.println(linearSearchInArray.searchTransposition(8));
	}
	public int searchTransposition(int ele) {
		for(int i=0;i<10;i++)
		{
			if(this.arr[i] == ele)
			{
				if(i>0)
				{
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
				}
				return i;
			}
		}
		return -1;
	}
	
	
}
