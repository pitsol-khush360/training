import services.ItemUtility;
import services.Cart;
import java.util.Scanner;

/**
 * @author Khushal Rankawat
 *
 */
public class ShoppingApp 
{
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int manage=0;
		do
		{
			System.out.println("1.Manage Items\n2.Manage Cart\nEnter Your choice : ");
			manage=sc.nextInt();

			switch(manage)
			{
				case 1:
						manageItems();
						break;
				case 2:
						manageCart();
						break;
				default:
						System.out.println("Please Enter Valid choice...");
						break;
			}
			sc.nextLine();
			System.out.println("Press 1 To Enter Manage Menu : ");
			manage=sc.nextInt();
		}while(manage==1);
		System.out.println("\t\t\t\t\tThanks For Using our Application.");
	}

	/**
	 * function for managing items
	 */
	private static void manageItems() 
	{
		int choice=0;
		do
		{
			System.out.println("1.Show Items\n2.Add Item\n3.Update Item\n4.Delete Item");
			System.out.println("Enter Your Choice : ");
			choice=sc.nextInt();
			
			ItemUtility itemUtility=new ItemUtility();
			
			switch(choice)
			{
				case 1:
					itemUtility.showItems();
					break;
					
				case 2:
					itemUtility.addItem();
					break;
					
				case 3:
					itemUtility.updateItem();
					break;
					
				case 4:
					itemUtility.deleteItem();
					break;
					
				default:
					System.out.println("Please Enter Valid Choice...");
					break;
			}
			System.out.println("Press 1 If You Want To Manage More Items : ");
			choice=sc.nextInt();
		}while(choice==1);
	}
	
	/**
	 * function for managing cart
	 */
	private static void manageCart() 
	{
		int choice=0;
		do
		{
			System.out.println("1.Show Cart\n2.Add Item In Cart\n3.Remove Item From Cart");
			System.out.println("Enter Your Choice : ");
			choice=sc.nextInt();
			
			Cart cart=new Cart();
			
			switch(choice)
			{
				case 1:
					cart.showCartItems();
					break;
					
				case 2:
					cart.addItemToCart();
					break;
					
				case 3:
					cart.removeItemFromCart();
					break;
				
				default:
					System.out.println("Please Enter Valid Choice...");
					break;
			}
			
			System.out.println("Press 1 If You Want To Regularly Manage Cart : ");
			choice=sc.nextInt();
		}while(choice==1);
	}
}
