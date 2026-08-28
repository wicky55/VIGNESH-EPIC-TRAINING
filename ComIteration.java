
import java.util.Scanner;
public class ComIteration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i= 0;i<n;i++){
		    arr[i] = in.nextInt();
		}
		int target = in.nextInt();
		
		int prev = 0,next = 0;
		while(prev<n){
		    int sum = 0;
		    for(int i=prev;i<=next;i++){
		        sum+=arr[i];
		    }
		    if(sum>=target){
		        prev++;
		        next=prev;
		    }
		    System.out.println(sum);//
		    next++;
		}
	}

}
