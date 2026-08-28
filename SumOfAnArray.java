
import java.util.Scanner;


public class SumOfAnArray {

	public static void main(String[] args) {
		//input=7
		//input=6 5 12 8 4 2 8
		//output = 12
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		int max =0;
		for (int i=0;i<size;i++)
		{
			arr[i]= in.nextInt();
			if (arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println(max);
		

	}

}
