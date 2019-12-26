package services;

/**
 * @author Khushal Rankawat
 *
 */
public class HexCalc
{
	/**
	 * @param h1 shows first hexadecimal number
	 * @param h2 shows second hexadecimal number
	 * @return returns addition of two hexadecimal number
	 */
	public String addHexaDecimals(String h1,String h2)
	{
		String temp1="",temp2="";
		
		// Removing Prefix 0x if hexadecimal string is entered in 0x... form.
		if(h1.charAt(0)=='0' && h1.charAt(1)=='x')
		{
			for(int i=2;i<h1.length();i++)
				temp1+=h1.charAt(i);
		}
		else
			temp1=h1;
		
		if(h2.charAt(0)=='0' && h2.charAt(1)=='x')
		{
			for(int i=2;i<h2.length();i++)
				temp2+=h2.charAt(i);
		}
		else
			temp2=h2;
		
		// Converting From Hexadecimal To Number.
		int num1=Integer.parseInt(temp1,16);
		int num2=Integer.parseInt(temp2,16);
		
		int sum=num1+num2;
		
		// Converting from number to hexadecimal string.
		String result=Integer.toHexString(sum);
		
		return result;
	}

	/**
	 * @param h1 shows first hexadecimal number
	 * @param h2 shows second hexadecimal number
	 * @return returns substraction of two hexadecimal number
	 */
	public String subHexaDecimals(String h1, String h2) 
	{
		String temp1="",temp2="";
		
		// Removing Prefix 0x if hexadecimal string is entered in 0x... form.
		if(h1.charAt(0)=='0' && h1.charAt(1)=='x')
		{
			for(int i=2;i<h1.length();i++)
				temp1+=h1.charAt(i);
		}
		else
			temp1=h1;
		
		if(h2.charAt(0)=='0' && h2.charAt(1)=='x')
		{
			for(int i=2;i<h2.length();i++)
				temp2+=h2.charAt(i);
		}
		else
			temp2=h2;
		
		// Converting From Hexadecimal To Number.
		int num1=Integer.parseInt(temp1,16);
		int num2=Integer.parseInt(temp2,16);
		
		int sub=num1-num2;
		
		// Converting from number to hexadecimal string.
		String result=Integer.toHexString(sub);
		
		return result;
	}

	/**
	 * @param h1 shows first hexadecimal number
	 * @param h2 shows second hexadecimal number
	 * @return returns multiplication of two hexadecimal number
	 */
	public String mulHexaDecimals(String h1, String h2) 
	{
		String temp1="",temp2="";
		
		// Removing Prefix 0x if hexadecimal string is entered in 0x... form.
		if(h1.charAt(0)=='0' && h1.charAt(1)=='x')
		{
			for(int i=2;i<h1.length();i++)
				temp1+=h1.charAt(i);
		}
		else
			temp1=h1;
		
		if(h2.charAt(0)=='0' && h2.charAt(1)=='x')
		{
			for(int i=2;i<h2.length();i++)
				temp2+=h2.charAt(i);
		}
		else
			temp2=h2;
		
		// Converting From Hexadecimal To Number.
		int num1=Integer.parseInt(temp1,16);
		int num2=Integer.parseInt(temp2,16);
		
		int mul=num1*num2;
		
		// Converting from number to hexadecimal string.
		String result=Integer.toHexString(mul);
		
		return result;
	}
	
	/**
	 * @param h1 shows first hexadecimal number
	 * @param h2 shows second hexadecimal number
	 * @return returns division of two hexadecimal number
	 */
	public String divHexaDecimals(String h1, String h2) 
	{
		String temp1="",temp2="";
		
		// Removing Prefix 0x if hexadecimal string is entered in 0x... form.
		if(h1.charAt(0)=='0' && h1.charAt(1)=='x')
		{
			for(int i=2;i<h1.length();i++)
				temp1+=h1.charAt(i);
		}
		else
			temp1=h1;
		
		if(h2.charAt(0)=='0' && h2.charAt(1)=='x')
		{
			for(int i=2;i<h2.length();i++)
				temp2+=h2.charAt(i);
		}
		else
			temp2=h2;
		
		// Converting From Hexadecimal To Number.
		int num1=Integer.parseInt(temp1,16);
		int num2=Integer.parseInt(temp2,16);
		
		int div=num1/num2;
		
		// Converting from number to hexadecimal string.
		String result=Integer.toHexString(div);
		
		return result;
	}

	/**
	 * @param h1 shows first hexadecimal number
	 * @param h2 shows second hexadecimal number
	 * @return returns true if two hexadecimal numbers are equal
	 */
	public boolean equalsHexaDecimals(String h1, String h2) 
	{
		String temp1="",temp2="";
		
		// Removing Prefix 0x if hexadecimal string is entered in 0x... form.
		if(h1.charAt(0)=='0' && h1.charAt(1)=='x')
		{
			for(int i=2;i<h1.length();i++)
				temp1+=h1.charAt(i);
		}
		else
			temp1=h1;
		
		if(h2.charAt(0)=='0' && h2.charAt(1)=='x')
		{
			for(int i=2;i<h2.length();i++)
				temp2+=h2.charAt(i);
		}
		else
			temp2=h2;
		
		// If Equals compareTo() returns 0
		if(temp1.compareTo(temp2)==0)
			return true;
		else
			return false;
	}

	/**
	 * @param h1 shows first hexadecimal number
	 * @param h2 shows second hexadecimal number
	 * @return returns true if first hexadecimal number is greater than second
	 */
	public boolean maxHexaDecimals(String h1, String h2) 
	{
		String temp1="",temp2="";
		
		// Removing Prefix 0x if hexadecimal string is entered in 0x... form.
		if(h1.charAt(0)=='0' && h1.charAt(1)=='x')
		{
			for(int i=2;i<h1.length();i++)
				temp1+=h1.charAt(i);
		}
		else
			temp1=h1;
		
		if(h2.charAt(0)=='0' && h2.charAt(1)=='x')
		{
			for(int i=2;i<h2.length();i++)
				temp2+=h2.charAt(i);
		}
		else
			temp2=h2;
		
		// If first is greater than second then compareTo() returns positive value.
		if(temp1.compareTo(temp2)>0)
			return true;
		else
			return false;
	}

	/**
	 * @param h1 shows first hexadecimal number
	 * @param h2 shows second hexadecimal number
	 * @return returns true if first hexadecimal number is less than second
	 */
	public boolean minHexaDecimals(String h1, String h2) 
	{
		String temp1="",temp2="";
		
		// Removing Prefix 0x if hexadecimal string is entered in 0x... form.
		if(h1.charAt(0)=='0' && h1.charAt(1)=='x')
		{
			for(int i=2;i<h1.length();i++)
				temp1+=h1.charAt(i);
		}
		else
			temp1=h1;
		
		if(h2.charAt(0)=='0' && h2.charAt(1)=='x')
		{
			for(int i=2;i<h2.length();i++)
				temp2+=h2.charAt(i);
		}
		else
			temp2=h2;
		
		// If first is less than second then compareTo() returns negative value.
		
		if(temp1.compareTo(temp2)<0)
			return true;
		else
			return false;
	}

	/**
	 * @param hex shows hexadecimal number
	 * @return returns decimal representation of hex
	 */
	public int hexaToDeci(String hex) 
	{
		String temp="";
		
		// Removing Prefix 0x if hexadecimal string is entered in 0x... form.
		if(hex.charAt(0)=='0' && hex.charAt(1)=='x')
		{
			for(int i=2;i<hex.length();i++)
				temp+=hex.charAt(i);
		}
		else
			temp=hex;
		
		// Converting From Hexadecimal To Number.
		int num=Integer.parseInt(temp,16);
		
		return num;
	}

	/**
	 * @param deci shows decimal number
	 * @return returns hexadecimal representation of decimal number
	 */
	public String deciToHexa(int deci) 
	{
		// Converting from number to hexadecimal string.
		String hex=Integer.toHexString(deci);
		return hex;
	}
}
