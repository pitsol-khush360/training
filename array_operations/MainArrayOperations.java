import java.util.Scanner;
import services.ArrOperation;

/**
 * @author Khushal Rankawat
 *
 */
public class MainArrayOperations 
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("1.Largest Mirror Section Of Array\n2.No. Of Clumps In Array\n"+
							"3.fixXY problem\n4.splitArray\nEnter Your Choice : ");
		int choice=sc.nextInt();
		
		ArrOperation arrOperation=new ArrOperation();
		switch(choice)
		{
			case 1:
				arrOperation.mirrorSection(inputArray());
				break;
			case 2:
				System.out.println("Clump Of Array is "+arrOperation.countClumps(inputArray()));
				break;
			case 3:
				int a[]=inputArray();
				System.out.println("Enter X To Be Fixed : ");
				int x=sc.nextInt();
				System.out.println("Enter Y For Which X To Be Followed : ");
				int y=sc.nextInt();
				printArray(arrOperation.fixXY(a,x,y));
				
				break;
			case 4:
				System.out.println(arrOperation.splitArray(inputArray()));
				break;
			default:
				System.out.println("Please Enter Valid Choice.");
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
	 * @param array that is to be print.
	 */
	public static void printArray(int []arr)
	{	
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}
}
