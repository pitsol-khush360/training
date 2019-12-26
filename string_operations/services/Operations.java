package services;

/**
 * @author Khushal Rankawat
 *
 */

public class Operations 
{
	/**
	 * @param str1 stands for first string
	 * @param str2 stands for second string
	 * @return returns 1 if strings are equal otherwise 0.
	 */
	public int strCompare(String str1, String str2) 
	{
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.equals(str2))
			return 1;
		else
			return 0;
	}
	
	/**
	 * @param str stands for string
	 * @return returns reverse of string.
	 */
	public String strReverse(String str) 
	{
		StringBuffer sb=new StringBuffer(str);
		// returning after conversion from stringbuffer to string.
		return sb.reverse().toString();
	}
	
	/**
	 * @param str stands for string
	 * @return returns string in toggle case (small char in capital and capital in small)
	 */
	public String strToggle(String str) 
	{
		String temp="";
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
				temp+=Character.toUpperCase(str.charAt(i));
			else
				if(Character.isUpperCase(str.charAt(i)))
					temp+=Character.toLowerCase(str.charAt(i));
			else
				temp+=str.charAt(i);
		}
		return temp;
	}
	
	/**
	 * @param stands for string
	 * @return returns largest word of string
	 */
	public String largestWord(String str1) 
	{
		// This Method Will Return Largest word(max length).If two word has same length then 
		// it will return last word.
		
		String str[]=str1.split(" ");
		
		int max=str[0].length();
		int index=0;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()>=max)
			{
				max=str[i].length();
				index=i;
			}
		}
		return str[index];
	}
}
