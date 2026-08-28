class one{
	int a=100;
}
class two extends one{
	int b=200;
}
class three extends one{
	int c=190;
}
class four extends two{
	int d=150;
}
class five extends three{
	int e=200;
}
class six extends five{
	int f=1000;
}
public class Hybrid {
	public static void main(String[] args)
	{
		six s = new six();
		four f = new four();
		System.out.println("Accessing the class three by class 6 obj :"+s.c);
		System.out.println("Accessing the class one by class 4 obj :"+f.a);
		System.out.println("Accessing the class five by class 6 obj :"+s.e);
	}

}
