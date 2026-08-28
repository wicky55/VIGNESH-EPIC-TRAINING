

import java.util.Scanner;

public class Min {
	public static void main(String[] args) {
		//input=7
		//input=6 5 12 8 4 2 8
		//output = 2
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		arr[0]=in.nextInt();
		int min = arr[0];
		for (int i=1;i<size;i++)
		{
			arr[i]= in.nextInt();
			if (arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println(min);
		

	}

}
