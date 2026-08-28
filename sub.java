import java.util.Scanner;
public class sub {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<=(n-k);i++)
		{
			for(int j=i;j<(i+k);j++)
			{
				System.out.print(arr[j]+" ");
			}
		}
	}

}
