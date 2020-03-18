//import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import services.IntSet;

/**
 * @author Khushal Rankawat
 *
 */

public class MainIntSet 
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		boolean temp=false;
		
		System.out.println("1.Check A Value Is A Member Of Set\n2.Find Size Of Set"+
						"\n3.Check For Subset\n4.Union Of Two Set\n5.Show IntSet\nEnter Choice : ");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				IntSet set=inputSet();
				temp=set.isMember(inputValue());
				if(temp==true)
					System.out.println("Value Exist In Set");
				else
					System.out.println("Value Does Not Exist In Set");
				break;
			case 2:
				IntSet set1=inputSet();
				System.out.println("Size is "+set1.size());
				break;
			case 3:
				IntSet set2=inputSet();
				IntSet set3=inputSet();
				temp=set2.isSubSet(set3);
				
				if(temp==true)
					System.out.println("Yes It Is Subset");
				else
					System.out.println("No,It Is Not Subset");
				
				break;
			case 4:
				IntSet set4=inputSet();
				IntSet set5=inputSet();
				Set<Integer> unionset=set4.union(set4,set5);
				System.out.println("Union is : "+unionset);
				break;
			case 5:
				IntSet set6=inputSet();
				set6.printIntSet();
		}
	}
	
	/**
	 * @return -> returns the intSet given by user.
	 */
	private static IntSet inputSet() 
	{
		// Randomly generating integers between 1 to 2000 and adding only 1-1000 in array
		System.out.println("How Many Values you want to add in set : ");
		int n=sc.nextInt();
		
		int temp[]=new int[n];
		
		for(int i=0;i<temp.length;i++)
			temp[i]=sc.nextInt();
		
/*		
 		Random r=new Random();
	
		for(i=0;i<500;i++)
			temp[i]=r.nextInt(1000);
*/
		
		IntSet tempSet=new IntSet(temp);
		return tempSet;
	}

	/**
	 * @return -> returns the value given by user.
	 */
	public static int inputValue()
	{
		System.out.println("Enter Value : ");
		int val=sc.nextInt();
		return val;
	}
}
