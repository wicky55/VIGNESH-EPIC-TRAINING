/*

*  
* *  
* * *  
* * * *  
* * * * *  
* * * *  
* * *  
* *  
*  

 
 */


public class PatternJ {
	public static void main(String[] args)
	{
		int n=5;
		for (int row=1;row<=(n*2)-1;row++)
		{
			int coltime= row > n ? (2*n)-row : row;
			for(int col=1;col<=coltime;col++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
