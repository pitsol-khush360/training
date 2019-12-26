package services;

/**
 * @author Khushal Rankawat
 *
 */
public class JobScheduler 
{
	public JobScheduler()
	{	
	}
	
	/**
	 * @param arr shows 2d array containing arrival time and burst time
	 */
	public void completion_time(int arr[][])
	{
		// completion time=previous process end time+burst time
		int completionTime=0;
		for(int i=0;i<arr.length;i++)
		{
			completionTime+=arr[i][1];
			System.out.println("Completion Time Of P"+i+" is : "+completionTime);
		}
	}
	
	/**
	 * @param arr shows 2d array containing arrival time and burst time
	 */
	public void turnaround_time(int arr[][])
	{
		// Turn Around Time = Completion Time - Arrival Time
		int completionTime=0;
		for(int i=0;i<arr.length;i++)
		{
			completionTime+=arr[i][1];
			System.out.println("Turn Around Time Of P"+i+" is : "+(completionTime-arr[i][0]));
		}
	}
	
	/**
	 * @param arr shows 2d array containing arrival time and burst time
	 */
	public void waiting_time(int arr[][])
	{
		// Waiting Time = Turnaround time - Burst Time.
		int completionTime=0;
		int turnaround=0;
		int waiting=0;
		
		for(int i=0;i<arr.length;i++)
		{
			completionTime+=arr[i][1];
			turnaround=completionTime-arr[i][0];
			waiting=turnaround-arr[i][1];
			System.out.println("Waiting Time Of P"+i+" is : "+waiting);
		}
	}
	
	/**
	 * @param arr shows 2d array containing arrival time and burst time
	 */
	public void average_waiting_time(int arr[][])
	{
		double avg=0.0;
		int sum=0;
		
		int completionTime=0;
		int turnaround=0;
		int waiting=0;
		
		for(int i=0;i<arr.length;i++)
		{
			completionTime+=arr[i][1];
			turnaround=completionTime-arr[i][0];
			waiting=turnaround-arr[i][1];
			sum+=waiting;
		}
		avg=sum/(double)arr.length;
		System.out.println("Average Waiting Time Is : "+avg);
	}
	
	/**
	 * @param arr shows 2d array containing arrival time and burst time
	 */
	public void maximum_waiting_time(int arr[][])
	{
		int max=0;
		int index=0;
		
		int completionTime=0;
		int turnaround=0;
		int waiting=0;
		
		for(int i=0;i<arr.length;i++)
		{
			completionTime+=arr[i][1];
			turnaround=completionTime-arr[i][0];
			waiting=turnaround-arr[i][1];
			
			if(i==0)
			{
				max=waiting;
				index=i;
			}
			else
			{
				if(waiting>=max)
				{
					max=waiting;
					index=i;
				}
			}
		}
		
		System.out.println("Maximum Waiting Time Is : "+max+" For P"+index);
	}
}
