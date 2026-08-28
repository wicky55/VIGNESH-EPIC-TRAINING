
import java.util.Scanner;
public class SecondLargesst {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size=in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array: ");
		for (int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		for (int i =0;i<size-1;i++)
		{
			for (int j=0;j<size-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					System.out.println(arr[j]);
				}
			}
			
		}

	}

}
