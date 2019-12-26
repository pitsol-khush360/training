import services.Area;
import java.util.Scanner;

/**
 * @author Khushal Rankawat
 *
 */
public class MainFindArea 
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Type Of Area You Want To Calculate"+
		"\n1.Triangle\n2.Rectangle\n3.Square\n4.Circle\nEnter Your Choice : ");
		int n=sc.nextInt();
		
		Area area=new Area();
		
		switch(n)
		{
			case 1:
				System.out.println("Area Of Triangle is "+area.getTriangleArea(inputParam(),inputParam()));
				break;
			case 2:
				System.out.println("Area Of Rectangle is "+area.getRectangleArea(inputParam(),inputParam()));
				break;
			case 3:
				System.out.println("Area Of Square is "+area.getSquareArea(inputParam()));
				break;
			case 4:
				System.out.println("Area Of Circle is "+area.getCircleArea(inputParam()));
				break;
			default:
				System.out.println("Please Enter Valid Choice!");
				break;
		}
	}
	
	/**
	 * @return returns width/height/side/radius given by user.
	 */
	public static double inputParam()
	{
		System.out.println("Enter (width/hieght/radius/side) : ");
		Double side=sc.nextDouble();
		return side;
	}
}
