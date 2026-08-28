class Employee{
    private String name;
    private int id;
    
    Employee(String n,int id){
        this.name = n;
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        this.name = n;
    }
}
public class getset
{
	public static void main(String[] args) {
		Employee emp = new Employee("Dharaneesh",123);
		System.out.println(emp.getName());
		emp.setName("Naveen");
		System.out.println(emp.getName());
		
	}
}
