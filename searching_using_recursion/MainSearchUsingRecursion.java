
import java.util.Scanner;
import services.Search;

/**
 * @author Khushal Rankawat
 *
 */
public class MainSearchUsingRecursion 
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("1.Linear Search\n2.Binary Search\n"+
					"Enter Your Choce");
		int choice=sc.nextInt();
		
		Search search=new Search();
		
		switch(choice)
		{
			case 1:
				System.out.println(search.linearSearch(inputArray(),inputNumber()));
				break;
			case 2:
				System.out.println(search.binarySearch(inputArray(),inputNumber()));
				break;
		}
	}

	/**
	 * @return returns array given by user.
	 */
	public static int[] inputArray()
	{
		System.out.println("Enter Size Of Array : ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter Array : ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		return arr;
	}
	
	/**
	 * @return returns number given by user
	 */
	public static int inputNumber()
	{
		System.out.println("Enter Number To Be Searched : ");
		int n=sc.nextInt();
		
		return n;
	}

}
