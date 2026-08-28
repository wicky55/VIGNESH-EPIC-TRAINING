
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int [size];
		int sum =0;
	
		for (int i=0;i<size;i++)
		{
			arr[i] = in.nextInt();
			sum+=arr[i];
		}
		System.out.println(sum);

		}

}
 