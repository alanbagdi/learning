package array;

import java.util.Scanner;

public class BinarySearchInArray {

	int arr[] ;
	public BinarySearchInArray()
	{
		this.arr = new int[] {1,2,3,4,5,6,7,8,9,10};
	}
	
	public static void main(String args[])
	{
		int n =0;
		BinarySearchInArray obj = new BinarySearchInArray();
		while(n!= -1)
		{
			System.out.println("Enter the element you want to search or -1 to terminate");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			if(n == -1) {
				sc.close();
				break;
			}
			System.out.println("Found "+n+" at index "+obj.search(n));
		}
	}
	
	private int search(int n) {
		int end = this.arr.length;
		int start=0;
		return binSearch(n, start,end);
	}
	
	private int binSearch(int n, int start, int end) {
		int mid  = (start+end)/2;
		if(start>end)
			return -1;
		if(this.arr[mid] == n)
			return mid;
		if(this.arr[mid]> n )
		{
			return binSearch(n, start, mid-1);
		}
		else
		{
			return binSearch(n, mid+1, end);
		}
		
	}
			
}
