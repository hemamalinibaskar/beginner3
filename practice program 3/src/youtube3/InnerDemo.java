package youtube3;

class Outer{
	void outerDisplay() {
		System.out.println("This is Outer class");
	}
	static class Inner{
		void innerDisplay() {
			System.out.println("This is Inner class");
		}
	}
}

public class InnerDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.outerDisplay();
		
		/*Outer.Inner i= o.new Inner();//Inner class is not static
		i.innerDisplay();*/
		
		Outer.Inner i = new Outer.Inner();//Inner class is static
		i.innerDisplay();
		
		
	}
}
