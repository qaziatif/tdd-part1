
public class Dollar extends Money {
	//private int amount;
	
	Dollar(int amount,String currency) {
		/*this.amount= amount;
		currency = currency;*/
		super(amount, currency);
	}
	String currency() {
		return currency;
	}
	
	/*Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}*/
	
	/*public boolean equals(Object object) {
		Dollar dollar= (Dollar) object;
		return this.amount == dollar.amount;
	}*/
	
	Money times(int multiplier) {
		return new Dollar(amount * multiplier,null);
	}
}
