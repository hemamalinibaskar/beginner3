package youtube3;
import java.lang.reflect.*;

public class Reflect {
	public static void main(String[] args) {
		
		Employee e = new Employee("mini",10000,"HR");
		
		Class cls = e.getClass();
		System.out.println(cls);
		System.out.println("Class Name: "+ cls.getName());
		
		Method[] methods = cls.getMethods();
		for(Method m: methods) {
			System.out.println(m);
			System.out.println(m.getName());
		}
		
		try {
			System.out.println(methods[3].invoke(e, null));
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}
