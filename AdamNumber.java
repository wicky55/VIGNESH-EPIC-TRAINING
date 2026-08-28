
import java.util.Scanner;
public class AdamNumber {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();//12
	        int square = n * n;//12*12=144
	        int temp = n;//12
	        int reverseNum = 0;
	        while (temp > 0) {
	            int digit = temp % 10;//12%10=2
	            reverseNum = reverseNum * 10 + digit;//0*10+2,
	            temp = temp / 10;//12/10=1
	        }

	        int reverseSquare = reverseNum * reverseNum;//21*21=441
	        temp = reverseSquare;//441
	        int finalReverse = 0;
	        while (temp > 0) {
	            int digit = temp % 10;//441%10=1
	            finalReverse = finalReverse * 10 + digit;//1,4,4
	            temp = temp / 10;
	        }

	        if (square == finalReverse)
	            System.out.println(n + " is an Adam Number");
	        else
	            System.out.println(n + " is Not an Adam Number");
	    }

}
