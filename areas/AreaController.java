package areas;
import java.util.Scanner;

public class AreaController 
{
	private Area area=new Area();
	
	public AreaController(String command)
	{
		Scanner sc=new Scanner(System.in);
		switch(command)
		{
			case "triangle":
				System.out.println("Enter Base(width) Of Triangle : ");
				double width=sc.nextDouble();
				System.out.println("Enter Height Of Triangle : ");
				double height=sc.nextDouble();
				System.out.println("Area Of Triangle is "+area.getTriangleArea(width,height));
				break;
				
			case "rectangle":
				System.out.println("Enter Width Of Rectangle : ");
				double w=sc.nextDouble();
				System.out.println("Enter Height Of Rectangle : ");
				double h=sc.nextDouble();
				System.out.println("Area Of Rectangle is "+area.getRectangleArea(w,h));
				break;
				
			case "square":
				System.out.println("Enter Side Of Square : ");
				double side=sc.nextDouble();
				System.out.println("Area Of Square is "+area.getSquareArea(side));
				break;
				
			case "circle":
				System.out.println("Enter Radius Of Circle : ");
				double radius=sc.nextDouble();
				System.out.println("Area Of Circle is "+area.getCircleArea(radius));
				break;
		}
		sc.close();
	}
}
