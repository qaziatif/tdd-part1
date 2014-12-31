
public abstract class Money {
	protected int amount;
	protected String currency;
	abstract Money times(int multiplier);
	
	/*static Dollar dollar(int amount) {
		return new Dollar(amount);
	}*/
	static Money dollar(int amount) {
		return new Dollar(amount,"USD");
	}
	static Money franc(int amount) {
		return new Franc(amount,"CHF");
	}
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	public boolean equals(Object object) {
		Money money= (Money) object;
		return amount == money.amount
				&& getClass().equals(money.getClass());
	}
	
	String currency() {
		return currency;
	}
	
	
	
}
