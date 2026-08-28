interface Employee{
    void display();
}

class FullTimeEmp implements Employee{
    public void display(){
        System.out.println("FullTime");
    }
}
class PartTimeEmp implements Employee{
    public void display(){
        System.out.println("PartTime");
    }
}


public class interfaceExample
{
	public static void main(String[] args) {
		Employee emp = new FullTimeEmp();
		emp.display();
	}
}