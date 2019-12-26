import services.Operations;
import java.util.Scanner;


/**
 * @author Khushal Rankawat
 *
 */

public class MainStringOperations 
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		Operations operation=new Operations();
		System.out.println("Enter Type Of Operation You Want To Perform"+
				"\n1.Compare Two Strings\n2.Reverse Of String\n3.Toggle Characters Of String"+
				"\n4.Find Largest Word In String\nEnter Your Choice : ");
				int n=sc.nextInt();
				sc.nextLine();
				
				switch(n)
				{
					case 1:
						System.out.println("String Comparision Result : "+operation.strCompare(inputString(),inputString()));
						break;
					case 2:
						System.out.println("Reverse is "+operation.strReverse(inputString()));
						break;
					case 3:
						System.out.println("Toggle Case is "+operation.strToggle(inputString()));
						break;
					case 4:
						System.out.println("Largest Word is "+operation.largestWord(inputString()));
						break;
					default:
						System.out.println("Please Enter Valid Choice!");
						break;
				}
	}
	
	/**
	 * @return returns a string given by user.
	 */
	public static String inputString()
	{
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		
		return str;
	}
}
