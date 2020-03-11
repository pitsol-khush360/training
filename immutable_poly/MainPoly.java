import java.util.Scanner;

import services.Poly;

/**
 * @author Khushal Rankawat
 *
 */

public class MainPoly 
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("1.Evaluate Polynomial On A Value\n2.Find Degree Of Polynomial"+
						"\n3.Add Two Polynomials\n4.Multiply Two Polynomials\n5.Show Polynomial\nEnter Choice : ");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				Poly p1=inputPolynomial();
				System.out.println("Value of polynomial is "+p1.evaluate(inputValue()));
				break;
			case 2:
				Poly p2=inputPolynomial();
				System.out.println("Degree is "+p2.degree());
				break;
			case 3:
				Poly p3=inputPolynomial();
				Poly p4=inputPolynomial();
				Poly sum=p3.addPoly(p3,p4);
				System.out.println("Addition is : ");
				sum.printPolynomial();
				
				break;
			case 4:
				Poly p5=inputPolynomial();
				Poly p6=inputPolynomial();
				Poly mul=p5.multiplyPoly(p5,p6);
				System.out.println("Multiplication is : ");
				mul.printPolynomial();
				break;
			case 5:
				Poly p7=inputPolynomial();
				p7.printPolynomial();
		}
	}
	
	/**
	 * @return -> returns the polynomial given by user.
	 */
	private static Poly inputPolynomial() 
	{
		System.out.println("Enter Highest Degree Of Polynomial : ");
		int deg=sc.nextInt();
		int tempDeg=deg;
		
		int temp[]=new int[deg+1];
		
		for(int i=0;i<temp.length;i++)
		{
			System.out.println("Enter Coefficient For x^"+deg);
			temp[i]=sc.nextInt();         // Reading Coefficient
			deg--;
		}
		
		Poly tempPoly=new Poly(temp,tempDeg);
		return tempPoly;
	}

	/**
	 * @return -> returns the value given by user.
	 */
	public static float inputValue()
	{
		System.out.println("Enter Value : ");
		float val=sc.nextFloat();
		return val;
	}
}
