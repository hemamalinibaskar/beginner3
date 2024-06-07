package youtube3;
import java.util.*;
import java.io.*;//File Handling

public class ExceptionHand {
	public static void main(String[] args) throws InsufficientTransactionException {
		/*int a=8, b=4;
		int c=0;
		try {
			int arr[] = null;//Unchecked error-runtime error
			System.out.println(arr[1]);
		}
		
		
		catch(ArithmeticException | NullPointerException e) {//OR operator
			System.out.println("It's Nullpointer exception");
		}
		
		catch(Exception e) {
			System.out.println("Error occured");
		}
		//System.out.println(c);*/
		
		/*File file = new File("and.txt");
		try {
			FileInputStream f = new FileInputStream(file);//Checked error-compile time
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		/*int n;
		try (Scanner sc = new Scanner(System.in)){//try with resource-it will get closed automatically
		n = sc.nextInt();
		}
		
		
		System.out.println(n);*/
		//finally {
		System.out.println("Finished");
		
		double bal =300, withdraw = 500;
		try{
		if(bal<withdraw) {
			throw new InsufficientTransactionException(withdraw-bal);
		}
		}
		catch(InsufficientTransactionException e) {
			System.out.println("Insufficient Balance");
		}
		
		
		
		
		
		
	}
}
