
import java.util.Scanner;
import services.MathOperations;

/**
 * @author Khushal Rankawat
 *
 */
public class MainRecursionOperations 
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("1.Find LCM Of Two Numbers\n2.Find HCF Of Two Numbers\n"+
					"Enter Your Choce");
		int choice=sc.nextInt();
		MathOperations useRecursion=new MathOperations();
		
		switch(choice)
		{
			case 1:
				System.out.println(useRecursion.getLCM(inputNumber(),inputNumber()));
				break;
			case 2:
				System.out.println(useRecursion.getHCF(inputNumber(),inputNumber()));
				break;
		}
	}

	/**
	 * @return returns number given by user.
	 */
	public static int inputNumber()
	{
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		return n;
	}

}
