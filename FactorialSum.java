public class FactorialSum
{
	public static void main(String[] args) {
		int n=121;
		int sum=1;
		int factSum=0; 
		while(n>0)
		{
		    int n1=n%10;   
		    int factpro=1;
		    for(int i=n1;i>=1;i--)
		    {
		        factpro*=i;
		    }
		    factSum+=factpro;
		    n=n/10 ;  
		}
		System.out.println(factSum);
	}
}
