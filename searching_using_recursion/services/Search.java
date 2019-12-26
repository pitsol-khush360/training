package services;

/**
 * @author Khushal Rankawat
 *
 */
public class Search 
{
	private static int start=0,end=0,index=-2;
	
	/**
	 * @param arr array
	 * @param value shows value to be searched 
	 * @return returns index if value found otherwise returns -1.
	 */
	public int linearSearch(int[] arr,int value) 
	{
		// Initializing start,end as array's lower and higher bound.
		if(start==0 && end==0)
		{
			start=0;
			end=arr.length-1;
		}
		
		if(start>end)
			index=-1;
		else
			if(arr[start]==value)
				index=start;
		else
			if(arr[end]==value)
				index=end;
		
		if(index==-2)
		{
			// increment lower bound and decrement higher bound for next linearSearch()
			start++;
			end--;
			linearSearch(arr,value);
		}
		return index;
	}

	/**
	 * @param arr shows array
	 * @param value value shows value to be searched in array
	 * @return returns index if value found otherwise returns -1.
	 */
	public int binarySearch(int[] arr, int value) 
	{	
		// Initializing start,end as array's lower and higher bound.
		if(start==0 && end==0)
		{
			start=0;
			end=arr.length-1;
		}
		
		if(start>end)  // 12 15 48 79 90
			index=-1;
		else
		{
			int mid=(start+end)/2;
				
			if(arr[mid]==value)
				index=mid;
			else
			if(value>arr[mid])
			{
				start=mid+1;
				binarySearch(arr,value);
			}
			else
			if(value<arr[mid])
			{
				end=mid-1;
				binarySearch(arr,value);
			}
		}
		return index;
	}
}
