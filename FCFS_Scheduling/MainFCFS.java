import services.JobScheduler;
import java.util.Scanner;

/**
 * @author Khushal Rankawat
 *
 */
public class MainFCFS 
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String ...args)
	{
		// Creating Reference Of JobScheduler Class for Accessing Operations.
		JobScheduler jobScheduler=new JobScheduler(); 
		
		int choice=0;
		do
		{
			System.out.println("1.Completion Time For Each Process\n2.Waiting Time For Each Process\n"+
					"3.Turn Around Time For Each Process\n4.Average Waiting Time Of Processes"+
					"\n5.Maximum Waiting Time Period For A Process\nEnter Your Choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					jobScheduler.completion_time(inputProcessTime());
					break;
				case 2:
					jobScheduler.waiting_time(inputProcessTime());
					break;
				case 3:
					jobScheduler.turnaround_time(inputProcessTime());
					break;
				case 4:
					jobScheduler.average_waiting_time(inputProcessTime());
					break;
				case 5:
					jobScheduler.maximum_waiting_time(inputProcessTime());
					break;
				default:
					System.out.println("Please enter valid choice...");
					break;
			}	
			System.out.println("Press 1 If You Want To Continue");
			choice=sc.nextInt();
		}while(choice==1);
		
		sc.close();
	}
	
	/**
	 * @return returns 2d array containing arrival and burst time given by user
	 */
	public static int[][] inputProcessTime()
	{
		System.out.println("Enter Number Of Processes : ");
		int processes=sc.nextInt();
		
		int arr[][]=new int[processes][2];
		
		for(int i=0;i<arr.length;i++)
		{
			int flag=1;
			for(int j=0;j<2;j++)
			{
				if(flag==1)
				{
					System.out.println("Enter Arrival Time For P"+i);
					flag=0;
					arr[i][j]=sc.nextInt();
				}
				else
				{
					System.out.println("Enter Burst Time For P"+i);
					arr[i][j]=sc.nextInt();
				}
			}
		}
		return arr;
	}
}
