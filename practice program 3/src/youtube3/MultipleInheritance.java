package youtube3;

class A {
	void display() {
		System.out.println("This is from class A");
	}
}

class B extends A{
	void display() {
		System.out.println("This is from class B");
	}
}

class C extends B{
	
}
public class MultipleInheritance {
	public static void main(String[] args) {
		
		C c = new C();
		c.display();
		
		A b = new B();
		b.display();
		
		
	}
}
