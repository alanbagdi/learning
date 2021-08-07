package array;

public class FindElement {

	public static void main(String args[])
	{
		FindElement obj = new FindElement();
		obj.findMissingElementInSortedArrayByIndex();
		obj.findMultipleMissingElementsInSortedArrayByIndex();
	}
	
	public int findMissingElementInSortedArray()
	{
		int arr[] = new int[] {1,2,3,4,5,6,7,8,10};
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum+= arr[i];
		}
		int n = arr[arr.length-1];
		 int wholeSum = (n*(n+1))/2;
		 return wholeSum-sum;
	}
	
	public void findMissingElementInSortedArrayByIndex()
	{
		int arr[] = new int[] {1,2,3,4,5,6,7,8,10};
		int diff = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]-i != diff)
			{
				System.out.println(arr[i]-1);
			}
		}
	}
	
	public void  findMultipleMissingElementsInSortedArrayByIndex()
	{
		int arr[] = new int[] {1,2,3,4,5,6,7,8,10,11,14,15};
		int diff = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]-i != diff)
			{
				while(diff<arr[i]-i)
				{
					System.out.println(diff+i);
					diff++;
				}
			}
		}
	}
}
