/*
 
1   5
 2 4 
  3  
 2 4 
1   5 
 */


import java.util.Scanner;
public class Xpattern {
	public static void main(String[] args) {
		
	
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print(i+1);
				}
				else if ((n-1)==(i+j))
				{
					System.out.print(j+1);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
}

}
