package youtube3;

public class Wrappercls {
	public static void main(String[] args) {
		
		int i = 10;
		float f = 5.4f;
		
		Integer i1 = Integer.valueOf(18);
		System.out.println(i1);
		
		Integer i2 = Integer.valueOf(i);//Boxing, wrapping
		System.out.println(i2);
		
		Integer i3 = 20;//autoboxing
		System.out.println(i3);
		
		int j = i2.intValue();//autounboxing
		System.out.println(j);
		
		String s = "909";
		int i4 = Integer.parseInt(s);
		System.out.println(i4);
		
		
		
		
		
		
	}

}
