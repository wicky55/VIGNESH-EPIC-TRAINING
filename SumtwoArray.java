

import java.util.Scanner;

public class SumtwoArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the No of Rows:");
		int rows=in.nextInt();
		System.out.println("Enter the No of Cols:");
		int Cols=in.nextInt();
		
		int arr[][]=new int[rows][Cols];
		int arr1[][]=new int[rows][Cols];
		int res[][]=new int[rows][Cols];
		
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<Cols;j++)
			{
				System.out.println("Enter the arr1 value :");
				arr[i][j]=in.nextInt();			
			}
		}
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<Cols;j++)
			{
				System.out.println("Enter the arr2 value :");
				arr1[i][j]=in.nextInt();			
			}
		}
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<Cols;j++)
			{
				res[i][j]=arr[i][j]+arr1[i][j];			
			}
		}
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<Cols;j++)
			{
				System.out.print(res[i][j]+" ");	
			}
			System.out.println();
		}

	}

}
