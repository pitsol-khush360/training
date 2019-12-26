package services;

/**
 * @author Khushal Rankawat
 *
 */
public class MathOperations 
{
	private static int common=1;   // for finding common.if found return else increment.
	
	/**
	 * @param num1
	 * @param num2
	 * @return returns LCM of num1 and num2
	 */
	public int getLCM(int num1, int num2) 
	{
		// Lowest Common multiple Of Two Numbers
		
		if (common%num1==0 && common%num2==0)
	    {
	        return common;
	    }
	    common++;
	    getLCM(num1,num2);    // function is recursively calling itself.
	    return common;
	}

	/**
	 * @param num1
	 * @param num2
	 * @return returns HCF of num1 and num2
	 */
	public int getHCF(int num1, int num2) 
	{
		/* Highest common Factor of two numbers.
		 * We will divide num2 by num1 and set remainder as num1 and num1 as num2 untill we don't find remainder 0 as num1
		 */
		
		if (num1==0)
	        return num2;
	    else
	        return getHCF(num2%num1,num1);
	}
}
