
import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the multiplication table: ");
		int n = in.nextInt();
		//for (int i=1;i<=10;i++)
		//{
			//System.out.println(n+"*"+i+"=" +n*i);
		//}
		for (int i=n;i<=n*10;i+=n)
		{
			System.out.println(i);
		}

	}

}
