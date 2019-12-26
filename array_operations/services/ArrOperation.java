package services;

/**
 * @author Khushal Rankawat
 *
 */
public class ArrOperation 
{
	/**
	 * @param inputArray
	 */
	public void mirrorSection(int[] inputArray) 
	{	
	}

	
	/**
	 * @param arr refers array.
	 * @return returns total clumps of array
	 */
	public int countClumps(int[] arr) 
	{
		int count=0;
		int temp=arr[0];
		int check=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==temp)        // If current element is equal to previous adjacent then incrementing check.
				check++;
			else
			{
				if(check>=2)       // else counting clump if two or more adjacent found.
					count++;
				
				check=1;       // setting check=1 for new comparision.Suppose new element already considered.
				temp=arr[i];        // Setting new element for which adjacent to be compare.
			}
			
			if(i==arr.length-1)  // for last time to set count if adjacent found.
			{
				if(check>=2)
					count++;
			}
		}
		return count;
	}

	/**
	 * @param arr refers array
	 * @param x refers value to fix
	 * @param y refers value that will be followed by x
	 * @return returns array after rearranging.
	 */
	public int[] fixXY(int[] arr,int x,int y) 
	{
		int countY=0,countOthers=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==y)
				countY++;
			else
				if(arr[i]!=x)
					countOthers++;	
		}
		
		int others[]=new int[countOthers];
		int ys[]=new int[countY];
		int j=0,k=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==y)
				ys[j++]=arr[i];
			else
				if(arr[i]!=x)
					others[k++]=arr[i];
				
		}
		
		k=0;
		j=0;
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==y)
			{
				if(k!=others.length)
					arr[i]=others[k++];
				else
					arr[i]=0;
				temp=i;
			}
			else
			if(arr[i]==x)
			{
				if(i!=arr.length-1)
				{
					arr[i+1]=y;
					temp=i+1;
				}
			}
			else
			{
				arr[i]=others[k++];
				temp=i;
			}
			i=temp;
		}
		return arr;
	}

	
	/**
	 * @param arr refers array
	 * @return returns index for which sum of both part of array is equal.otherwise returns -1.
	 */
	public int splitArray(int[] arr) 
	{
		int index=0;
		int sumOneSide=0,sumOtherSide=0;
		
		// First index can't be that index so we have to start with index 1
		
		for(int i=1;i<arr.length;i++)
		{
			// ReSet after every iteration.
			sumOneSide=0;
			sumOtherSide=0;
			
			for(int j=0;j<i;j++)
				sumOneSide+=arr[j];
			
			for(int j=i;j<arr.length;j++)
				sumOtherSide+=arr[j];
			
			if(sumOneSide==sumOtherSide)
				index=i;
		}
		
		if(index!=0)        
			return index;
		else
			return -1;
	}
}
