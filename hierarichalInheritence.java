class AA
{
	int a=500;
}
class BB extends AA
{
	int b=550;
}
class CC extends AA
{
	int c=600;
}
class DD extends BB
{
	int d=600;
}

public class hierarichalInheritence {

	public static void main(String[] args) {
		CC ccObj = new CC();
		BB bbObj=new BB();
		DD ddObj=new  DD();
		System.out.println(ccObj.a);
		System.out.println(ddObj.b);
	}

}
