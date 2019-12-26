package services;

/**
 * @author Khushal Rankawat
 *
 */
public class Item 
{
	private int itemId;
	private String itemName;
	private int itemQuantity;
	private double itemPrice;
	
	public Item(int itemId, String itemName, int itemQuantity, double itemPrice) 
	{
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}
	
	public Item() {}

	public int getItemId() 
	{
		return itemId;
	}

	public void setItemId(int itemId) 
	{
		this.itemId = itemId;
	}

	public String getItemName() 
	{
		return itemName;
	}

	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}

	public int getItemQuantity() 
	{
		return itemQuantity;
	}
	
	public void setItemQuantity(int itemQuantity) 
	{
		this.itemQuantity = itemQuantity;
	}

	public double getItemPrice() 
	{
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) 
	{
		this.itemPrice = itemPrice;
	}
}
