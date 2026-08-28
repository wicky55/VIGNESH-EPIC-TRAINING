
//* * * * *   
//* * * *   
//* * *   
//* *   
//* 

public class PatternE {

	public static void main(String[] args) {
		int n=5;
		int printvalue=1;
		for (int row=1;row<=n;row++)
		{
			printvalue = row % 2 == 0 ? 0 : 1;
			for(int col=1;col<=row;col++)
			{
				System.out.print(printvalue);
				printvalue = printvalue == 0 ? 1 : 0;
			}
			
			System.out.println(" ");
		}

	}

}
  
 

