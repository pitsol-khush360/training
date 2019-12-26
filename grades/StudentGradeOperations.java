import services.MarkSheet;
import java.util.Scanner;

/**
 * @author Khushal Rankawat
 *
 */
public class StudentGradeOperations 
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Type Of Operation You Want To Perform"+
				"\n1.Average Of Grade\n2.Maximum Of All Grade\n3.Minimum Of All Grade"+
				"\n4.Total Percentage Of Passed Students\nEnter Your Choice : ");
				int n=sc.nextInt();
				
				MarkSheet markSheet=new MarkSheet();
				int num=inputStudent();         // To input total number of students.
				// inputGrades is  used to create array of MarkSheet via taking num as input.
				
				switch(n)
				{
					case 1:
						System.out.println("\nAverage Of All Grade = "+markSheet.average(inputGrades(num),num));
						break;
					case 2:
						System.out.println("Maximum Of All Grade = "+markSheet.maxGrade(inputGrades(num),num));
						break;
					case 3:
						System.out.println("Minimum Of All Grade = "+markSheet.minGrade(inputGrades(num),num));
						break;
					case 4:
						System.out.println("Total Percentage Of Passed Students = "+markSheet.passedPercentage(inputGrades(num),num));
						break;
					default:
						System.out.println("Please Enter Valid Choice!");
						break;
				}
				sc.close();
	}
	
	/**
	 * @return returns number of student given as input
	 */
	public static int inputStudent()
	{
		System.out.println("Enter Number Of Students : ");
		int n=sc.nextInt();
		return n;
	}
	
	/**
	 * @param n refers number of student
	 * @return returns array of object (MarkSheet) type.
	 */
	public static MarkSheet[] inputGrades(int n)
	{
				// Making Reference For MarkSheet Class.
				MarkSheet grades[]=new MarkSheet[n];
				
				for(int i=0;i<n;i++)
				{
					System.out.print("Enter Grade Of Student : ");
					double grade=sc.nextDouble();
					
					if(grade>=0 && grade<=100)
						grades[i]=new MarkSheet(grade);
					else
					{
						System.out.println("Please Enter Grade Between 0 to 100.");
						System.exit(0);
					}
				}
				return grades;
	}
}
