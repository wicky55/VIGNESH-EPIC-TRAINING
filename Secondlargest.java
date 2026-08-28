import java.util.Scanner;
public class Secondlargest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=in.nextInt();
		int[] arr=new int[size];
		int count=1;
		int pos=in.nextInt();
		System.out.print("Enter the array value : ");
		for (int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		for (int i=0;i>size;i++)
		{
			
			if (arr[i]!=pos)
			{
				break;
			}
		}
		System.out.println(arr[pos]);
		 }
	}


