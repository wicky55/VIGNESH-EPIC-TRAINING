import java.util.*;
public class SumExam
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    int num=in.nextInt();
	    int sum=1;
	    while(num>0)
	    {
	        sum+=num%10;
	        num=num/10;
	    }
		System.out.println(sum);
	}
}