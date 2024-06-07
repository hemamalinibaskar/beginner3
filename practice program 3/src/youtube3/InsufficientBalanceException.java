package youtube3;

public class InsufficientBalanceException extends Exception {
	double money;
	InsufficientBalanceException(double m){
		money =m;
	}
}
