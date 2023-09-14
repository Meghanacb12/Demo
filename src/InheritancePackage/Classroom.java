package InheritancePackage;

//-------------Single inheritance----------------

	
public class Classroom extends Student{  	

	public static void main(String[] args) {
		
		Classroom c=new Classroom();
		c.study();
	}
	
}

class Student {
	public void study() {
		System.out.println("students study");
	}
}