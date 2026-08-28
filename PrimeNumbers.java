
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");//13
		int num=in.nextInt();
		boolean isPrime=true;
		if (num<=1)
		{
			isPrime=false;
		}
		else
		{
			for(int i=2;i<=num/2;i++)//13/2-6
			{
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is Not a Prime Number");

	}

}
