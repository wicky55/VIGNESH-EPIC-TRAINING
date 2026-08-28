
import java.util.Scanner;
public abstract class twodarray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the No of Rows:");
		int rows=in.nextInt();
		
		System.out.println("Enter the No of Cols:");
		int Cols=in.nextInt();
		
		int arr[][]=new int[rows][Cols];
		
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<Cols;j++)
			{
				System.out.println("Enter the value :");
				arr[i][j]=in.nextInt();			
			}
		}
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<Cols;j++)
			{
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
		
	}

}
