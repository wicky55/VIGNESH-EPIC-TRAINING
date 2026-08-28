
import java.util.Scanner;
class Customer{
    String cusName;
    String cusPhNo;
    int cusAge;
    Customer[] cusArr = new Customer[100];
    int index = 0;
    
    Customer(){
        
    }
    Customer(String n,String p ,int a){
        this.cusName = n;
        this.cusPhNo = p; //current class refer
        this.cusAge = a;
    }
        
    void createCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Cus name:");
        String name = in.nextLine();
        System.out.println("Enter the Cus phno:");
        String phno = in.nextLine();
        System.out.println("Enter the Cus age:");
        int age = in.nextInt();
        Customer cus = new Customer(name,phno,age);
        cusArr[index] = cus ;
        index++;
        System.out.println("Customer Created Successfully");
        
    }
    
    void displayCustomer(){
        for (int i = 0; i < index ;i++){
            System.out.println("Customer ID: " + i);
            System.out.println("Name: "+cusArr[i].cusName);
            System.out.println("Ph no: "+cusArr[i].cusPhNo);
            System.out.println("Age: "+cusArr[i].cusAge);
        }
    }
    
    void GetCusbyID(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Product ID :");
        int id = in.nextInt();
        if (id >= 0 && id < index){
            System.out.println("Name: "+ cusArr[id].cusName);
            System.out.println("Ph No: "+ cusArr[id].cusPhNo);
            System.out.println("Age: "+ cusArr[id].cusAge);
        }else{
            System.out.println("Customer not Found");
        }
    }
}

class ProductA{
    String proName;
    String proBrand;
    int proPrice;
    int proQty;              
    ProductA[] proArr = new ProductA[100];
    int index = 0;
    
    ProductA(){
        
    }
    ProductA(String n,String b ,int p,int q){
        this.proName = n;
        this.proBrand = b;
        this.proPrice = p;
        this.proQty = q;
    }
        
    void createProduct(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the  Pro name:");
        String name = in.nextLine();
        System.out.println("Enter the Pro brand:");
        String brand = in.nextLine();
        System.out.println("Enter the Pro price:");
        int price = in.nextInt();
        System.out.println("Enter the Pro quantity (stock):");
        int qty = in.nextInt();
        ProductA pro = new ProductA(name,brand,price,qty);
        proArr[index] = pro ;
        index++;
        System.out.println("Product Created Successfully");
        
    }
    
    void displayProduct(){
        for (int i = 0; i < index ;i++){
            System.out.println("Product ID: " + i);
            System.out.println("Name: "+proArr[i].proName);
            System.out.println("Brand: "+proArr[i].proBrand);
            System.out.println("Price: "+proArr[i].proPrice);
            System.out.println("Available Quantity: "+proArr[i].proQty);
        }
    }
    
   void GetProbyID(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Product ID :");
        int id = in.nextInt();
        if(id >= 0 && id < index){
            System.out.println("Name: "+ proArr[id].proName);
            System.out.println("Brand: "+ proArr[id].proBrand);
            System.out.println("Price: "+ proArr[id].proPrice);
            System.out.println("Available Quantity: "+ proArr[id].proQty);
        }else{
            System.out.println("Product not Found");
        }
    }
}
class Bill{
    int billId;
    int cusId;
    String cusName;
    String cusPhNo;
    int cusAge;
    BillProduct bpObj;
    int noOfProduct;
    int index = 0;
    Bill[] billArr = new Bill[100];
    Bill()
    {
    	
    }
    
    Bill(int billId,int cusId,String cusName,String cusPhNo,int cusAge,BillProduct obj,int  n){
        this.billId=billId;
        this.cusId = cusId;
        this.cusName = cusName;
        this.cusPhNo = cusPhNo;
        this.cusAge = cusAge;
        this.bpObj = obj;
        this.noOfProduct=n;
    }
    void createBill(Customer cus,ProductA proObj){
    	
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the customer id: ");
        int id = in.nextInt();
        String cusName = cus.cusArr[id].cusName;
        String cusPhNo = cus.cusArr[id].cusPhNo;
        int cusAge = cus.cusArr[id].cusAge;

        System.out.println("Enter the no of products: ");
        int n = in.nextInt();
        BillProduct bp = new BillProduct();
        int actualCount = 0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the Product Id: ");
            int proId = in.nextInt();


            System.out.println("Enter the Product quantity: ");
            int proQua = in.nextInt();
            proObj.proArr[proId].proQty -= proQua;
            String proName = proObj.proArr[proId].proName;
            int proCost = proObj.proArr[proId].proPrice;
            int totalPrice = proCost * proQua;

            BillProduct bplist = new BillProduct(proId,proName,proQua,proCost,totalPrice);
            bp.billproArr[actualCount] = bplist;
            actualCount++;
        }
        Bill bill = new Bill(index,id,cusName,cusPhNo,cusAge,bp,actualCount);
        billArr[index] = bill;
        index++;
        System.out.println("Bill Created Successfully");
    }
    void diplayBill(ProductA proObj)
    {
    	for(int i=0;i<index;i++)
    	{

    		System.out.println("Bill ID: "+billArr[i].billId);
    		System.out.println("Customer ID: "+billArr[i].cusId);
    		System.out.println("Customer Name: "+billArr[i].cusName);
    		System.out.println("Phone No: "+billArr[i].cusPhNo);
    		System.out.println("Age: "+billArr[i].cusAge);
    		System.out.println();
    		int grandTotal = 0;
    		for(int j=0;j<billArr[i].noOfProduct;j++)
    		{
    			int productId=billArr[i].bpObj.billproArr[j].proId;
    			if(productId>=0&&productId< proObj.index) {
    			System.out.println("Product ID: "+billArr[i].bpObj.billproArr[j].proId);
    			System.out.println("Product Name: "+billArr[i].bpObj.billproArr[j].proName);
    			System.out.println("Quantity: "+billArr[i].bpObj.billproArr[j].proQua);
    			System.out.println("Cost per unit: "+billArr[i].bpObj.billproArr[j].proCost);
    			System.out.println("Total: "+billArr[i].bpObj.billproArr[j].totalPrice);
    			System.out.println();
    			grandTotal += billArr[i].bpObj.billproArr[j].totalPrice;
    			}
    			
    		}
    		System.out.println("Grand Total: "+grandTotal);
    		
    	}
    }
}

class BillProduct{
    int proId;
    String proName;
    int proQua;
    int proCost;
    int totalPrice;
    BillProduct[] billproArr = new BillProduct[100];
    BillProduct(){
        
    }
    BillProduct(int id,String name,int qua,int cost,int total){
        this.proId = id;
        this.proName = name;
        this.proQua = qua;
        this.proCost = cost;
        this.totalPrice = total;
    }
    
}



public class Mainn
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    ProductA pro = new ProductA();
	    Customer cus = new Customer();
	    Bill  bill=new Bill();
		while(true){
		    System.out.println("1)Create Customer \n2)Display Customer \n3)Get Customer by ID \n4)Create Product \n5)Display Product \n6)Get Product by ID \n7)Create Bill \n8)Display Bill");
		    int n = in.nextInt();
		    switch(n){
		        case 1:{
		            cus.createCustomer();
		            break;
		        }
		        case 2:{
		            cus.displayCustomer();
		            break;
		        }
		        case 3:{
		            cus.GetCusbyID();
		            break;
		        }
		        case 4:{
		            pro.createProduct();
		            break;
		        }case 5:{
		            pro.displayProduct();
		            break;
		        }
		        case 6:{
		            pro.GetProbyID();
		            break;
		        }
		        case 7:{
		        	bill.createBill(cus,pro);
		            break;
		        }
		        case 8:{
		        	bill.diplayBill(pro);
		            break;
		        }
		        
		        default: {
		            System.out.println("invalid");
		        }
		    }
		}
	}
}