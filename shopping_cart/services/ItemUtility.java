package services;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Khushal Rankawat
 *
 */
public class ItemUtility 
{
	private static LinkedList<Item>list=new LinkedList<Item>();
	private Scanner sc=new Scanner(System.in);

	public ItemUtility()
	{
	}

	/**
	 * function to show all items available.
	 */
	public void showItems() 
	{	
		if(list.size()!=0)
		{
			System.out.println("Item Id\t\tItem Name\tItem Quantity\tItem Price");
			System.out.println("______________________________________________________");
			for(Item i:list)
			{
				System.out.println(i.getItemId()+"\t\t"+i.getItemName()+"\t\t"+i.getItemQuantity()
				+"\t\t"+i.getItemPrice());
			}
			System.out.println("______________________________________________________");
		}
		else
			System.out.println("Sorry! No Items To Show...");
	}
	
	public LinkedList<Item> getItems()
	{
		return list;
	}
	
	/**
	 * function to add new item.
	 */
	public void addItem()
	{
		int choice=0;
		do
		{
			System.out.println("Enter Item Id : ");
			int id=sc.nextInt();
			sc.nextLine();                       // To Clear The Input Buffer.
			System.out.println("Enter Item Name : ");
			String name=sc.nextLine();
			System.out.println("Enter Item Quantity : ");
			int quantity=sc.nextInt();
			System.out.println("Enter Item Price : ");
			double price=sc.nextDouble();
			
			Item item=new Item(id,name,quantity,price);
			list.add(item);
			
			System.out.println("Press 1 If You Want To Add More Item : ");
			choice=sc.nextInt();
			
		}while(choice==1);
	}
	
	/**
	 * function to delete item form item list.
	 */
	public void deleteItem()
	{
		System.out.println("Enter Item Id To Delete : ");
		int id=sc.nextInt();
		
		Item item=null;
		
		for(Item i:list)
		{
			if(i.getItemId()==id)
			{
				item=i;
				break;
			}	
		}
		
		if(item!=null)
		{
			list.remove(item);
			System.out.println("Item With Id "+id+" Deleted Successfully.");
		}
		else
			System.out.println("Item With Item Id "+id+" Not Found...");
	}
	
	/**
	 * function to update existing item.
	 */
	public void updateItem()
	{
		System.out.println("Enter Id Of Item Whom You Want To Edit : ");
		int id=sc.nextInt();
		
		Item item=null;
		
		for(Item i:list)
		{
			if(i.getItemId()==id)
			{
				item=i;
				break;
			}	
		}
		
		if(item!=null)
		{
			System.out.println("1.Update Item Name\n2.Update Item Quantity"
					+ "\n3.Update Item Price\n4.Update All Details\nEnter Choice : ");
			int c=sc.nextInt();
			sc.nextLine();         // To Clear Input Buffer.
			
			String name="";
			int quantity=0;
			double price=0.0;
			int index=list.indexOf(item);
			
			switch(c)
			{
				case 1:
						System.out.println("Enter New Item Name : ");
						name=sc.nextLine();
						price=item.getItemPrice();
						quantity=item.getItemQuantity();
						item=new Item(id,name,quantity,price);
						list.set(index,item);
						break;
				case 2:
						System.out.println("Enter New Item Quantity : ");
						quantity=sc.nextInt();
						name=item.getItemName();
						price=item.getItemPrice();
						// creating new updated item with same id and set to same index in list.
						item=new Item(id,name,quantity,price);
						list.set(index,item);
						break;
				case 3:
						System.out.println("Enter New Item Price : ");
						price=sc.nextDouble();
						name=item.getItemName();
						quantity=item.getItemQuantity();
						item=new Item(id,name,quantity,price);
						list.set(index,item);
						break;
				case 4:
						System.out.println("Enter New Item Name : ");
						name=sc.nextLine();
						System.out.println("Enter New Item Quantity : ");
						quantity=sc.nextInt();
						System.out.println("Enter New Item Price : ");
						price=sc.nextDouble();
						item=new Item(id,name,quantity,price);
						list.set(index,item);
						break;
				default:
						System.out.println("Please,Enter Valid Choice...");
						break;
			}
			System.out.println("Item With Id "+id+" Updated Successfully.");
		}
		else
			System.out.println("Item With Item Id "+id+" Not Found...");
	}
}
