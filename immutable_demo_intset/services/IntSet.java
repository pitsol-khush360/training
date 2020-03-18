package services;

import java.util.HashSet;
import java.util.Set;

public class IntSet 
{
	private HashSet<Integer> intSet;

	public IntSet() {}
	
	public IntSet(int []arr) 
	{
		intSet=new HashSet<Integer>();
		for(Integer temp:arr)
		{
			intSet.add(temp);
		}
	}
	
	/**
	 * @param x refers to an integer value.
	 * @return true if value exist in intSet
	 */
	public boolean isMember(int x)
	{
		boolean retValue=false;
		
		if(intSet.contains(x))
			retValue=true;
		
		return retValue;		
	}
	
	/**
	 * @return returns the size of the intSet
	 */
	public int size()
	{
		// size() returns the size of set.
		return intSet.size();	
	}
	
	/**
	 * @param subSet refers to a intSet.We will check this is a subset of intSet or not.
	 * @return boolean value.true if it is subset.
	 */
	public boolean isSubSet(IntSet subSet)
	{
		boolean check=false;
		int yes=1;
		
		for(Integer x:subSet.getIntSet())
		{
			if(!intSet.contains(x))
			{
				yes=0;
				break;
			}	
		}
		
		if(yes==1)
			check=true;
		
		return check;
	}
	
	/**
	 * @param s1 intSet1
	 * @param s2 intSet2
	 * @return returns the set that contains union of s1 and s2
	 */
	public Set<Integer> union(IntSet s1,IntSet s2)
	{
		// We Know That Set does not store duplicate values so we will add both to a new set.
		Set <Integer>temp=new HashSet<Integer>();
		
		// adding all values of s1 to temp set.
		for(Integer x:s1.getIntSet())
		{
			temp.add(x);
		}
		
		// adding all values of s1 to temp set.
		for(Integer x:s2.getIntSet())
		{
			temp.add(x);
		}
		return temp;
	}
	
	public void printIntSet()
	{
		System.out.println(intSet);
	}

	public HashSet<Integer> getIntSet() {
		return intSet;
	}
}
