package InheritancePackage;

//------------Multiple inheritance---------------
public class Employee implements Company, Department{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.empid();
		e.ctype();
		e.departmentname();
	}
	
	private void empid() {
		System.out.println("EID86");
	}

	public void ctype() {
		System.out.println("Product based company");
	}
	
	public void departmentname() {
		System.out.println("Testing");
	}
}
