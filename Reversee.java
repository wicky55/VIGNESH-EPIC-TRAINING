import java.util.*;
public class Reversee

{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the number :");
	int n = in.nextInt();
	int val=1;
	int count=0;
	while(n/val>0)
	{
	   val=val*10;
	   count++;
	}
    // while(n>0)
    // {
    //     n=n/10;
    //     count++;
    // }
	System.out.println(count);
	}
}
