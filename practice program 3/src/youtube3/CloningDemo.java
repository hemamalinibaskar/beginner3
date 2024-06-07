package youtube3;
import java.util.*;

class Course implements Cloneable{
	String course;
	int fees;
	
	
	
	Course(String c, int f){
		course= c;
		fees = f;
		
	}
	
	Course(){
		
	}
	
	void Display() {
		System.out.println("Course Name: "+course);
		System.out.println("fees: "+ fees);
		
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		}
}

class Student implements Cloneable{
	String Name;
	int id;
	Course cour;
	
	Student(String n, int i,Course c){
		id = i;
		Name = n;
		cour = c;
		
	}
	
	Student(){
		
	}
	
	Student(Student s){
		this.id =id;
		this.Name = Name;
		this.cour =cour;
	}
	
	void Display() {
		System.out.println("Name: "+Name);
		System.out.println("id: "+ id);
		cour.Display();
	}
	
	//For Deep Copy we Have to implement this method in top cls also
	
	protected Object clone() throws CloneNotSupportedException {
		Student s =(Student)super.clone();
		s.cour =(Course)s.cour.clone();
		return s;
	}
}

public class CloningDemo {
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Course c = new Course("Core Java",5000);
		c.Display();
		
		Student s1 = new Student("Hema",001,c);
		s1.Display();
		c.course= "SQL";
		
		Student s2 = s1;//it will pass the reference of the s1 obj
		s2.Display();
		
		Student s3 = (Student)s1.clone();//It has the same content as s1 obj
		s3.Display();
		
		Student s4 = new Student(s3);	
		
	}
}
