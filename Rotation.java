
import java.util.Scanner;
public class Rotation {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=in.nextInt();
	}
	int rot =in.nextInt();
	int k=0;
	while(k<rot) {
	int temp=arr[0];
	for(int i=0;i<n-1;i++)
	{
		arr[i]=arr[i+1];
	}
	arr[n-1]=temp;
	k++;
	}
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}

}
}