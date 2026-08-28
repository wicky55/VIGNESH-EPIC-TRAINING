
import java.util.Scanner;
class PhNumberNotValidException extends Exception{
    PhNumberNotValidException(String str){
        super(str);
    }
}

class StoreData{
    void display(String phNo) throws PhNumberNotValidException{
        if(phNo.length()!=10)
        throw new PhNumberNotValidException("The Given number is not valid");
        else 
        System.out.println("Phno is Valid");
    }
}


public class err
{
	public static void main(String[] args) {
	            Scanner in = new Scanner(System.in);
	            StoreData sd = new StoreData();
	            try{
	                System.out.println("Enter your Num: ");
	                String phNo = in.nextLine();
	                sd.display(phNo);
	            }
	            catch(Exception e){
	                System.out.println(e);
	            }
	}
}
