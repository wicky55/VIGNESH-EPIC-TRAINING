/*
 
55555  
4444  
333  
22  
1  

 */


public class PatternH {

	public static void main(String[] args) {
		int n=5;
		for (int row = 1;row<=n;row++)
		{
			for (int col=1;col<=n-(row-1);col++)
			{
				System.out.print((n-row)+1);
			}
			System.out.println("  ");
		}

	}

}
