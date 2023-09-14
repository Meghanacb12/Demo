package InheritancePackage;


class Fish {
	void swim() {
		System.out.println("swims");
	}
}
class Shark extends Fish {
	public void big() {
		System.out.println("size is big");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Shark s=new Shark();
		s.swim();
		s.big();

	}

}
