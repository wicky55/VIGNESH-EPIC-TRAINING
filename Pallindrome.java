
import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");//1221
        int n = sc.nextInt();

        int original = n;//1221
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;//1,2,2,1
            reverse = reverse * 10 + digit;//0*10+1,1*10+2,12*10+2,122*10+1
            n = n / 10;//122,12,1
        }

        if (original == reverse)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");

	}

}
