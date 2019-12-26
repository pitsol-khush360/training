package services;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Khushal Rankawat
 *
 */
public class Cart 
{
	private CartItem cartItem;
	
	private static LinkedList<CartItem>cartItemList=new LinkedList<CartItem>();
	private Scanner sc=new Scanner(System.in);
	
	public Cart(){}
	
	/**
	 *  Function to add items in the cart
	 */
	public void addItemToCart()
	{
		System.out.println("Enter Item Id To Add Item In Cart : ");
		int id=sc.nextInt();
		
		Item item=null;
		
		// Fetching All Items From Item Model.
		LinkedList<Item>items=new ItemUtility().getItems();
		
		// Checking if item with given id is available or not.
		for(Item i:items)
		{
			if(i.getItemId()==id)
			{
				item=i;
				break;
			}
		}
		
		// If Item Is Available then add to cart.
		if(item!=null)                   
		{
			int count=0;
			int qty=0;
			
			// checking if item is already in cartItemList (means item is already added in cart)
			for(CartItem i:cartItemList)
			{
				if(i.getItem()==item)
				{
					count++;
					item=i.getItem();
					qty=i.getItemCartQuantity();
					
					// Removing existing cart item because we have to update it with quantity.
					cartItemList.remove(i);
					break;
				}
			}
			
			if(count!=0)
			{	
				// adding existing cart quantity after increment by 1.
				qty+=1;
				if(qty<=item.getItemQuantity())
				{
					// Setting new cartQuantity Of Item
					cartItem=new CartItem(item,qty);
					// Adding updated cart item to cartItemList
					cartItemList.add(cartItem);
					System.out.println("Item With Id "+id+" Successfully Added In Cart.");
				}
				else
				{
					qty-=1;
					// keeping cart item with existing quantity.
					cartItem=new CartItem(item,qty);
					cartItemList.add(cartItem);
					System.out.println("Sorry! All Quantity Of This Item Is Sold.");
				}
			}
			else
			{
				// If First time added in cart then quantity will be 1.
				qty=1; 
				if(qty<=item.getItemQuantity())
				{
					cartItem=new CartItem(item,qty);
					cartItemList.add(cartItem);
					System.out.println("Item With Id "+id+" Successfully Added In Cart.");
				}
				else
					System.out.println("Sorry! All Quantity Of This Item Is Sold.");
			}
		}
		else
			System.out.println("Sorry! Item With Id "+id+" Not Available.");
	}
	
	
	/**
	 * function to remove item from cart
	 */
	public void removeItemFromCart()
	{
		System.out.println("Enter Item Id To Remove Item From Cart : ");
		int id=sc.nextInt();
		
		cartItem=null;
		
		// Checking if item with entered id is available in cart for remove.
		for(CartItem i:cartItemList)
		{
			if(i.getItem().getItemId()==id)
			{
				cartItem=i;
				break;
			}
		}
		
		if(cartItem!=null)
		{
			cartItemList.remove(cartItem);
			System.out.println("Item With Id "+id+" Successfully Removed From Cart.");
		}
		else
			System.out.println("Item With Id "+id+" Not Found In Cart.");
	}
	
	/**
	 * function to show all cart items.
	 */
	public void showCartItems()
	{
		double bill=0.0;         // To Store Bill.
		
		// Fetching cartItemList.So one CartItem contains item and its quantity(in cart).
		if(cartItemList.size()!=0)
		{
			System.out.println("Item Id\t\tItem Name\tItem Quantity\tItem Price");
			System.out.println("______________________________________________________");
			
			for(CartItem i:cartItemList)
			{
				double price=i.getItem().getItemPrice();
				price=price*i.getItemCartQuantity();
				
				bill+=price;
				
				System.out.println(i.getItem().getItemId()+"\t\t"+i.getItem().getItemName()+"\t\t"
						+i.getItemCartQuantity()+"\t\t"+price);
			}
			System.out.println("______________________________________________________");
			System.out.println("\nYour Total Bill : "+bill);
		}
		else
			System.out.println("Your Cart Is Empty...");
	}
}
