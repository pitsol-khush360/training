package areas;
import java.util.Scanner;

public class FindArea {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Type Of Area You Want To Calculate"+
		"\n1.Triangle\n2.Rectangle\n3.Square\n4.Circle\nEnter Your Choice : ");
		int n=sc.nextInt();
		
		String command="";
		switch(n)
		{
			case 1:
				command="triangle";
				break;
			case 2:
				command="rectangle";
				break;
			case 3:
				command="square";
				break;
			case 4:
				command="circle";
				break;
			default:
				System.out.println("Please Enter Valid Choice!");
				break;
		}
		
		AreaController areaController=new AreaController(command);
		sc.close();
	}
}
