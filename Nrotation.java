
import java.util.Scanner;
public class Nrotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] arr = new int[n];
		int rot=in.nextInt();
		for (int i=n-rot;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<rot-1;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
