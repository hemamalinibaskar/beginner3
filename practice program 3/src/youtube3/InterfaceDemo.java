package youtube3;

interface Vehicle{//single abstract Method- SAM interface
	int i = 20;//Final, static var cannot be changed
	void ride();//Functional Inteerface which has 1 abstract method and diff default methods
	default void display() {
		System.out.println("This is from vehicle diplay method");
	}
}

/*abstract class Vehicle{
	abstract void ride();
}*/

class Car implements Vehicle{
	public void ride() {
		System.out.println("This is car");
	}
	public void display() {
		System.out.println("This is car Display");
	}
}

class Bike implements Vehicle{
	public void ride() {
		System.out.println("This is Bike");
	}
}

class Mech{
	void check(Vehicle v) {
		System.out.println("Checking...");
		v.ride();
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		
			Mech m = new Mech();
			Vehicle c = new Car();//interface can create only diff cls obj
			Vehicle b = new Bike();
			
			m.check(c);
			m.check(b);
			
			System.out.println("This is next phase");
			
			c.ride();
			b.ride();
			
			System.out.println("Interface checking");
			
			Vehicle v = new Car();
			v.display();
			
			Vehicle Ano = new Vehicle() {// interface allows to create obj while creating the anonymous class 
				public void ride() {
					System.out.println("This is an anonymous class");
				}
			};
			
			Ano.ride();
			
			//Lambda expression - only used in Functional Interface
			
			Vehicle l = ()->System.out.println("This is lambda expression");
			l.ride();
			
			
	}

}
