package youtube3;
import java.util.*;

class Employee implements Comparable<Employee> {
	private String name;
	private double salary;
	private String position;
	
	Employee(String n, double s, String p){
		name  = n;
		salary = s;
		position = p;
	}
	Employee(){
		name = " ";
		salary = 0.0;
		position =" ";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double s) {
		salary = s;
	}
	
	public double raiseSalary(double percent) {
		return salary += salary*percent/100;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String p) {
		position =p;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Salary: "+salary);
		System.out.println("Position: "+position);
	}
	
	public boolean equals(Object obj) {//equals method overriding
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
		
		if(this.getClass() != obj.getClass())
			return false;
		
		Employee e = (Employee)obj;
			return this.name.equals(e.name) && this.salary == e.salary && this.position.equals(e.position);
	}
	
	public int compareTo(Employee s) {
		if(salary == s.salary)
			return 0;
		if(salary < s.salary)
			return -1;
		return 1;
	}
	
	
	
	public String sortArray(String n){
		char tempArray[] = n.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
		
	}
}

class Manager extends Employee{
	private double bonus;
	
	Manager(String n, double s, String p,double b){
		super(n,s,p);
		bonus = b;
	}
	Manager(){
		bonus =0.0;
	}
	public double getBonus() {
		return bonus;
	}
	
	
	public void setBonus(double b) {
		bonus = b;
	}
	
	public double getSalary() {//method overriding
		return super.getSalary()+ bonus;
	}
	
	
	public void displayDetails() {
		System.out.println("Name: "+super.getName());
		System.out.println("Salary: "+super.getSalary());
		System.out.println("Bonus: "+getBonus());
		System.out.println("Total Salary: "+getSalary());
	}
}

public class InheritanceFunc {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		Employee e1 = new Employee();
		
		Employee e2 = new Employee("Shin",40000,"Tester");
		
		Employee e3 = new Employee("Shin",40000,"Tester");
		
		/*System.out.println("Enter the name: ");
		e1.setName(scanner.nextLine());
	
		
		System.out.println("Enter the salary: ");
		e1.setSalary(scanner.nextDouble());
		
		System.out.println("Raised salary: "+ e1.raiseSalary(10));
		
		System.out.println("Enter the position: ");
		e1.setPosition(scanner.next());
		
		e1.displayDetails();*/
		
		Manager m1 = new Manager("Riya",15000,"HR",3000);
		
		System.out.println(e2.equals(e3));
		
		int arr[]= new int[30];
		Employee[] employ = new Employee[3];
		employ[0]= new Employee("Riya", 20000, "HR");
		employ[1]= new Employee("Ram",30000,"Developer");
		employ[2]= new Employee("Mini", 25000,"Tester");
		
		for(Employee emp: employ) {
			System.out.println(emp.getName()+" "+emp.getSalary());
		}
		
		Arrays.sort(employ);
		
		System.out.println("After Sorting: ");
		
		for(Employee emp: employ) {
			System.out.println(emp.getName()+" "+emp.getSalary());
		}
		
		Arrays.sort(employ);
		for(Employee emp: employ){
			System.out.println(emp.getName());
		}
		
		
		
		
		
		
		//m1.displayDetails();
		
		/*System.out.println("Enter the bonus amount: ");
		m1.setBonus(scanner.nextDouble());
		System.out.println(m1.getSalary());*/
	}

}
