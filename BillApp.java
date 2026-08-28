
import java.util.*;

class Product
{
	String proName;
	int Cost;
	int quantity;
	Product()
	{
		
	}
	Product(String n,int c,int q){
		this.proName=n;
		this.Cost=c;
		this.quantity=q;
		
	}

	
	void createProduct()
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the product Name");
		String name=in.nextLine();
		System.out.println("Enter the cost");
		int cost=in.nextInt();
		System.out.println("Enter the qunatity");
		int quantity=in.nextInt();
		Product pro=new Product(name,cost,quantity);
		
	}
}

public class BillApp {

	public static void main(String[] args) {
		

	}

}
