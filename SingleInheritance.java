class A
{
	int a=19;
	void PrintData(int a)
	{
		System.out.println("Class A");
	}
	
}
class B extends  A
{
	int b=10;
	void PrintData(int a,int b)
	{
		System.out.println("Class B");
	}
}
class C extends B
{
	int c=119;
	void PrintData(int a,int b,int c)
	{
		System.out.println("Class c");
	}
	
}
public class SingleInheritance {
	public static void main(String[] args)
	{
		B bObj=new B();
		C cObj=new C();
		System.out.println(bObj.a);
		System.out.println(cObj.b);
		bObj.PrintData(10,20);
		cObj.PrintData(12);
		
	}

}
