package youtube3;

abstract class Shape{
	double height;
	double breadth;
	
	Shape(double h, double b){//constructot
		height = h;
		breadth = b;
	}
	abstract void area();	

}


class Square extends Shape{
	Square(double h, double b){//overriding
		super(h,b);
	}
	void area() {
		System.out.println("Area of the square: "+ (height+breadth));
	}
}

class Triangle extends Shape{
	Triangle(double h, double b){//overriding
		super(h, b);
	}

	void area() {
		System.out.println("Area of the triangle: "+ (0.5*height*breadth));
	}
}

public class Abstraction {
	public static void main(String args[]) {
		Shape[] s1 = new Shape[3];
		
		s1[0] = new Square(3,4);
		s1[1] = new Triangle(8,12);
		s1[2] = new Square(4,4);
		
		for(Shape s: s1) {//method invoking
			s.area();		}
		
		
	}
}
