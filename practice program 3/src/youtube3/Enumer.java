package youtube3;
enum weekdays{
	Sunday("sun"),Monday("mon"),Tuesday("tue"),Wednesday("wed"),Thursday("thurs"),Friday("Fri"),Saturday("sat");
	
	private String abb;
	
	weekdays(String ab){
		abb = ab;
	}
	
	public String getabbr() {
		return abb;
	}
}

public class Enumer {
	public static void main(String[] args) {
		
		weekdays w1 = weekdays.Sunday;
		weekdays w2 = weekdays.Monday;
		weekdays w3 = weekdays.Tuesday;
		weekdays w4 = weekdays.Wednesday;
		weekdays w5 = weekdays.Thursday;
		weekdays w6 = weekdays.Friday;
		weekdays w7 = weekdays.Saturday;
		
		System.out.println(w5.getabbr());
		System.out.println(w3.compareTo(w7));
		System.out.println(w2.values());
		System.out.println(w4.ordinal());
	}
}
