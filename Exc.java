
import java.util.*;

public class Exc {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	//System.out.println("Enter the age: ");	
		/*
		 * for(;;) {
		 * 
		 * int age = in.nextInt();
		 * 
		 * try { if(age<18) { throw new ArithmeticException(); } else {
		 * System.out.println("Age is valid "); break; }
		 * 
		 * } catch (Exception e) { System.out.println("Enter the valid age"); }
		 * 
		 * }
		 */
    	System.out.println("Enter the phone number: ");	
    	for(;;) {
        	
            String num = in.nextLine();

            try {
            	if(num.length()==10)
            	{
            		throw new ArithmeticException();
            	}
            	else
            	{
                System.out.println("Number is valid");  
            	break;
            	}
            	
            }	
            catch (Exception e) {
                System.out.println("Enter the valid number :");
            }
            
        }
}
}