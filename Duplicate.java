
import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = in.nextInt();
		int[] org = new int[size];
		int[] dup=new int[size];
		System.out.println("Enter the number: ");
		for (int i=0;i<size;i++) {
			
			org[i]=in.nextInt();
			
		}

		for (int i =0;i<size;i++)
		{
			if(dup[i]!= 1) {
				for (int j=i+1;j<size;j++) {
					if (org[i]==org[j])
					{
						dup[i]=2;
						dup[j]=1;
					
					}
				}
			}
		}
		for (int i=0;i<size;i++)
		{
			if (dup[i]==2)
			{
				System.out.print(org[i]+" ");
			}
		}
	}

}
