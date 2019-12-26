package services;

/**
 * @author Khushal Rankawat
 *
 */
public class CartItem 
{
	private Item item;
	private int itemCartQuantity;
	
	public CartItem() 
	{
		
	}
	
	public CartItem(Item item, int itemCartQuantity) 
	{
		this.item = item;
		this.itemCartQuantity = itemCartQuantity;
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getItemCartQuantity() {
		return itemCartQuantity;
	}
	public void setItemCartQuantity(int itemCartQuantity) {
		this.itemCartQuantity = itemCartQuantity;
	}
	
	
}
