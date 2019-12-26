package services;

import java.text.DecimalFormat;

/**
 * @author Khushal Rankawat
 *
 */
public class MarkSheet
{
	private double grade;

	public MarkSheet() {}   				// default constructor.
	
	/**
	 * @param grade setting grade for student
	 */
	public MarkSheet(double grade) 			// parameterize constructor.
	{
		this.grade = grade;
	}
	
	/**
	 * @param markSheet refers array of markSheet
	 * @param n
	 * @return returns average of grades.
	 */
	public double average(MarkSheet []markSheet,int n)
	{
		double sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=markSheet[i].getGrade();
		}
		
		// changing Double value upto 2 decimal format.
		DecimalFormat df=new DecimalFormat("#.##");     // # shows prefix and after .(dot) no. of places.
		double temp=Double.parseDouble(df.format(sum/n));
		
		return temp;     // sum is of double type so result is also in double type.
	}
	
	/**
	 * @param markSheet
	 * @param n
	 * @return returns maximum of grades upto two decimal format.
	 */
	public double maxGrade(MarkSheet []markSheet,int n)
	{
		double max=markSheet[0].getGrade();
		
		for(int i=0;i<n;i++)
			if(markSheet[i].getGrade()>=max)
				max=markSheet[i].getGrade();
		
		DecimalFormat df=new DecimalFormat("#.##");
		return Double.parseDouble(df.format(max));
	}
	
	/**
	 * @param markSheet
	 * @param n
	 * @return returns minimum of grades upto two decimal format.
	 */
	public double minGrade(MarkSheet []markSheet,int n)
	{
		double min=markSheet[0].getGrade();
		
		for(int i=0;i<n;i++)
			if(markSheet[i].getGrade()<=min)
				min=markSheet[i].getGrade();
		
		DecimalFormat df=new DecimalFormat("#.##");
		return Double.parseDouble(df.format(min));
	}
	
	/**
	 * @param markSheet refers array of MarkSheet type.
	 * @param n
	 * @return returns percentage of passed students
	 */
	public double passedPercentage(MarkSheet []markSheet,int n)
	{
		// Assuming grade>=40 as pass so counting total passed students then calculating percentage.
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			if(markSheet[i].getGrade()>=40)
				count++;
		}
		
		DecimalFormat df=new DecimalFormat("#.##");
		// typecasting n to double so result is also in double.
		return Double.parseDouble(df.format((count*100)/(double)n));   
	}
	
	/**
	 * @return returns grade
	 */
	public double getGrade() 
	{
		return grade;
	}
}

