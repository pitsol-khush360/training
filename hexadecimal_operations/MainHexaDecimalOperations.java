import services.HexCalc;
import java.util.Scanner;

/**
 * @author Khushal Rankawat
 *
 */
public class MainHexaDecimalOperations 
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		System.out.println("Enter Type Of Operation You Want To Perform"+
				"\n1.Addition Of Two Hexadecimal Numbers\n2.Substraction Of Two Hexadecimal Numbers\n"+
				"3.Multiplication Of Two Hexadecimal Numbers\n4.Division Of Two Hexadecimal Numbers\n"+
				"5.Compare Two Hexadecimal Numbers\n6.Find Decimal Representation Of Hexadecimal Number"+
				"\n7.Find Hexadecimal Representation Of Decimal Number\n\nEnter Your Choice : ");
				int n=sc.nextInt();
			
				HexCalc hexCalc=new HexCalc();
				
				switch(n)
				{
					case 1:
						System.out.println("Addition Is : "+hexCalc.addHexaDecimals(inputHexNumber(),inputHexNumber()));
						break;
					case 2:
						System.out.println("Substraction Is : "+hexCalc.subHexaDecimals(inputHexNumber(),inputHexNumber()));
						break;
					case 3:
						System.out.println("Multiplication Is : "+hexCalc.mulHexaDecimals(inputHexNumber(),inputHexNumber()));
						break;
					case 4:
						System.out.println("Division Is : "+hexCalc.divHexaDecimals(inputHexNumber(),inputHexNumber()));
						break;
					case 5:
						System.out.println("Choose One Among These : ");
						System.out.println("1.For Equals\n2.Is First Maximum\n3.Is First Minimum"+
						"\nEnter Your Choice : ");
						n=sc.nextInt();
						
						switch(n)
						{
							case 1:
								System.out.println(hexCalc.equalsHexaDecimals(inputHexNumber(),inputHexNumber()));
								break;
							case 2:
								System.out.println(hexCalc.maxHexaDecimals(inputHexNumber(),inputHexNumber()));
								break;
							case 3:
								System.out.println(hexCalc.minHexaDecimals(inputHexNumber(),inputHexNumber()));
								break;
							default:
								System.out.println("you Entered Wrong Choice...");
								break;
						}
						break;
					case 6:
						System.out.println("Hexadecimal To Decimal Conversion Result : "+hexCalc.hexaToDeci(inputHexNumber()));
						break;
					case 7:
						System.out.println("Decimal To Hexadecimal Conversion Result : "+hexCalc.deciToHexa(inputNumber()));
						break;
					default:
						System.out.println("Please Enter Valid Choice!");
						break;
				}
				System.out.println("\n\t\tThanks For Using This Application...");
	}
	
	/**
	 * @return returns hexadecimal number given by user
	 */
	public static String inputHexNumber()
	{
		System.out.println("Enter Hex Number : ");
		String hex=sc.next();
		return hex;
	}
	
	/**
	 * @return returns number given by user
	 */
	public static int inputNumber()
	{
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		return num;
	}
}
