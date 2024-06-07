package youtube3;

public class InsufficientTransactionException extends Exception {
	double amount;
	InsufficientTransactionException(double a){
		amount = a;
		
	}

}
