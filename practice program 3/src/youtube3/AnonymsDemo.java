package youtube3;

class Hero{
	void Acting() {
		System.out.println("This is Actor");
	}
}

/*class Heroine extends Hero{
	void Acting() {
		System.out.println("This is Actress");
	}
}*/

public class AnonymsDemo {
	public static void main(String[] args) {
		Hero ro = new Hero();
		ro.Acting();
		
		/*Heroine ne = new Heroine();
		ne.Acting();
		
		Hero h1 = new Heroine();
		h1.Acting();*/
		
		Hero Heroine = new Hero()
				{
			void Acting() {
				System.out.println("This is Actress");
			}
				};
				Heroine.Acting();
				
				
	}
}
