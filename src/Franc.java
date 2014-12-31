
public class Franc extends Money{
	//private int amount;
	Franc(int amount,String currency) {
		super(amount, currency);
	}
	/*Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}*/
	Money times(int multiplier) {
		return new Franc(amount * multiplier,null);
	}
		
	String currency() {
		return currency;
	}
}
