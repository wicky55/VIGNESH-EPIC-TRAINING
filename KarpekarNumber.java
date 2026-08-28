
import java.util.Scanner;
public class KarpekarNumber {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        int square = n * n;
	        int temp = n;
	        int digits = 0;

	        while (temp > 0) {
	            digits++;
	            temp = temp / 10;
	        }
	        int divisor = 1;
	        for (int i = 1; i <= digits; i++) {
	            divisor = divisor * 10;
	        }
	        int left = square / divisor;
	        int right = square % divisor;
	        if ((left + right == n && right != 0) || n == 1)
	            System.out.println(n + " is a Kaprekar Number");
	        else
	            System.out.println(n + " is Not a Kaprekar Number");
	    }
	}

